package com.jenkiens.service;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.jenkiens.exception.NoFailedJobException;
import com.jenkiens.pojo.FailedJob;
import com.jenkiens.pojo.JenkinesReader;
import com.jenkiens.pojo.Job;
import com.jenkiens.pojo.config.BuildStatus;
import com.jenkiens.pojo.config.Checkstyle;
import com.jenkiens.pojo.config.CheckstyleVolaition;
import com.jenkiens.pojo.config.ConfigReport;
import com.jenkiens.pojo.config.FailedToAll;
import com.jenkiens.pojo.config.PMD;
import com.jenkiens.pojo.config.PMDVolaition;
import com.jenkiens.pojo.config.Reporters;
import com.jenkiens.pojo.config.Thresholds;
import com.jenkiens.pojo.config.UnstableTotalAll;
import com.jenkiens.pojo.config.Volaition;
import com.jenkiens.propertiy.ConfigurationPropertiesReader;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Configuration
public class JekinesConfigService {

	@Autowired
	@Qualifier("restTemplate")
	RestTemplate restTemplate;

	@Autowired
	ConfigurationPropertiesReader config;

	@Autowired
	JekinesConfigService configServ;

	JenkinesReader jenkinesReader;

	public List<JenkinesReader> findThreshold() {
		List<JenkinesReader> listRead = new ArrayList<>();
		Volaition volaitionCheckstyle = null;
		Volaition volaitionPmd = null;
		BuildStatus build = null;
		String volUrlCheckstyle = "";
		String volUrlpmd = "";
		for (String project : config.getProjectlist()) {

			String url = config.getProject_url().replace("[project]", project) + config.getApi_json();
			build = restTemplate.getForObject(url, BuildStatus.class);

			volUrlCheckstyle = build.getLastSuccessfulBuild().getUrl() + "checkstyleResult/" + config.getApi_json();
			volUrlpmd = build.getLastSuccessfulBuild().getUrl() + "pmdResult/" + config.getApi_json();

			log.info("------------volUrlCheckstyle  " + volUrlCheckstyle);
			log.info("------------volUrlpmd  " + volUrlpmd);

			try {

				CheckstyleVolaition cl = null;
				PMDVolaition pl = null;
				PMD pmdThreshold = null;
				Checkstyle checkstyleThreshold = null;
				Map<String, JenkinesReader> config = this.configReport();

				for (Map.Entry<String, JenkinesReader> entry : config.entrySet()) {

					if (entry.getValue().getProjectName().equals(project)) {
						if (entry.getValue().getCheckstyleThreshold().isCheckstyle()) {

							volaitionCheckstyle = restTemplate.getForObject(volUrlCheckstyle, Volaition.class);
							cl = CheckstyleVolaition.builder()
									.numberOfHighPriorityWarnings(volaitionCheckstyle.getNumberOfHighPriorityWarnings())
									.numberOfLowPriorityWarnings(volaitionCheckstyle.getNumberOfLowPriorityWarnings())
									.numberOfNormalPriorityWarnings(
											volaitionCheckstyle.getNumberOfNormalPriorityWarnings())
									.numberOfWarnings(volaitionCheckstyle.getNumberOfWarnings()).build();

							checkstyleThreshold = entry.getValue().getCheckstyleThreshold();

						} else {
							cl = CheckstyleVolaition.builder().pluginResult("No plugin FOund").build();
						}
						if (entry.getValue().getPmdThreshold().isPMD()) {
							volaitionPmd = restTemplate.getForObject(volUrlpmd, Volaition.class);
							pl = PMDVolaition.builder()
									.numberOfHighPriorityWarnings(volaitionPmd.getNumberOfHighPriorityWarnings())
									.numberOfLowPriorityWarnings(volaitionPmd.getNumberOfLowPriorityWarnings())
									.numberOfNormalPriorityWarnings(volaitionPmd.getNumberOfNormalPriorityWarnings())
									.numberOfWarnings(volaitionPmd.getNumberOfWarnings()).build();

							pmdThreshold = entry.getValue().getPmdThreshold();
						} else {
							pl = PMDVolaition.builder().pluginResult("No plugin FOund").build();
						}
					}
				}

				listRead.add(jenkinesReader.builder().projectName(project)
						.configUrl(build.getLastSuccessfulBuild().getUrl()).checkstyleVolaition(cl).pmdVolaition(pl)
						.lastSuccessfulBuild(build.getLastSuccessfulBuild()).checkstyleThreshold(checkstyleThreshold)
						.pmdThreshold(pmdThreshold).build());

			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		return listRead;
	}

	private void checkPlugin(String project)
			throws XMLStreamException, IOException, FactoryConfigurationError, NoPluginSpecifieException {

	}

	public List<Job> findFailedJobs() throws NoFailedJobException {

		String url = config.getBase_url() + config.getApi_json();
		System.out.println(url);

		List<Job> listFailedjob = restTemplate.getForObject(url, FailedJob.class).getJobs().stream()
				.filter(job -> job.getColor().equals("red") || job.getColor().equals("aborted"))
				.collect(Collectors.toList());

		if (!listFailedjob.isEmpty()) {
			for (String project : config.getProjectlist()) {
				listFailedjob.stream().filter(job -> job.getName().equals(project)).collect(Collectors.toList());

			}
			return listFailedjob;
		} else
			throw new NoFailedJobException("No Job Failed ");

	}

	public Map<String, JenkinesReader> configReport()
			throws XMLStreamException, IOException, FactoryConfigurationError, NoPluginSpecifieException {

		Map<String, JenkinesReader> map = new HashMap<>();
		try {

			List<String> list = config.getProjectlist();
			for (String project : list) {
				String url = config.getProject_url().replace("[project]", project) + "config.xml";

				log.info("------------Project URL " + url);
				String xml = restTemplate.getForObject(url, String.class);
				log.info("------------Project Xml readed  ");

				jenkinesReader = JenkinesReader.builder().projectName(project).configUrl(url).build();
				log.info("------------jenkinesReader info 1  " + jenkinesReader);

				JenkinesReader temp = getXml2Json(xml, jenkinesReader);
				log.info("------------jenkinesReader info 2 xml2Json  " + temp);

				if (temp == null)
					map.put(project, JenkinesReader.builder().pluginDetails("No plugin Specify").build());
				else
					map.put(project,
							temp.builder().pmdThreshold(temp.getPmdThreshold())
									.checkstyleThreshold(temp.getCheckstyleThreshold()).projectName(project)
									.configUrl(url).build());

			}
		} catch (HttpClientErrorException e) {

		}
		System.out.println(map);

		return map;

	}

	private JenkinesReader getXml2Json(String xml, JenkinesReader jenkinesReader)
			throws FactoryConfigurationError, XMLStreamException, IOException, NoPluginSpecifieException {
		String json = "";
		try {
			XmlMapper xmlMapper = new XmlMapper();
			XMLInputFactory xmlif = XMLInputFactory.newInstance();
			XMLStreamReader xmlsr = xmlif.createXMLStreamReader(new StringReader(xml));
			ObjectMapper jsonMapper = new ObjectMapper();
			ConfigReport config = xmlMapper.readValue(xmlsr, ConfigReport.class);

			Reporters report = config.getReporters();

			Checkstyle checkstyle;
			PMD pmd;

			/*
			 * if() jenkinesReader.setPluginDetails("No Plugin Found In "); else
			 */
			if (report == null) {
				jenkinesReader.setCheckstyleThreshold(
						Checkstyle.builder().Failed(new FailedToAll()).unstableTotalAll(new UnstableTotalAll())
								.pluginCheckstyle("CHECKSTYLE Not Found").isCheckstyle(false).build());

				jenkinesReader.setPmdThreshold(PMD.builder().Failed(new FailedToAll())
						.unstableTotalAll(new UnstableTotalAll()).pluginPMD("PMD  Not Found").isPMD(false).build());
			} else {

				jenkinesReader = getPluginThreshold(report);
			}

		} catch (NullPointerException v) {

			throw new NoPluginSpecifieException("No Plugin Found In " + jenkinesReader.getProjectName());
		}

		log.info("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR  " + jenkinesReader);
		return jenkinesReader;
	}

	private JenkinesReader getPluginThreshold(Reporters report) {
		FailedToAll Failed = new FailedToAll();
		UnstableTotalAll unstableTotalAll = new UnstableTotalAll();
		// Status thresholds (Totals)
		Thresholds tr = null;

		if (report.getHudsonPluginsCheckstyleCheckStyleReporter() != null && report
				.getHudsonPluginsCheckstyleCheckStyleReporter().getPluginName().trim().equals("[CHECKSTYLE]")) {
			tr = report.getHudsonPluginsCheckstyleCheckStyleReporter().getThresholds();

			if (tr.getFailedTotalAll() != "" || tr.getFailedTotalHigh().trim() != ""
					|| tr.getFailedTotalLow().trim() != "" || tr.getFailedTotalNormal().trim() != "") {

				Failed.setFlagFailedToAll(true);
				Failed.setFailedTotalAll(tr.getFailedTotalAll());
				Failed.setFailedTotalHigh(tr.getFailedTotalHigh());
				Failed.setFailedTotalNormal(tr.getFailedTotalNormal());
				Failed.setFailedTotalLow(tr.getFailedTotalLow());
				System.out.println(Failed);
			} else {

				Failed = new FailedToAll();
				Failed.setFlagFailedToAll(false);
				System.out.println(Failed);
			}
			if (tr.getUnstableTotalAll() != "" || tr.getUnstableTotalHigh().trim() != ""
					|| tr.getUnstableTotalLow().trim() != "" || tr.getUnstableTotalNormal().trim() != "") {

				unstableTotalAll = new UnstableTotalAll();
				unstableTotalAll.setFlagUnstableTotalAll(true);
				unstableTotalAll.setUnstableTotalAll(tr.getUnstableTotalAll());
				unstableTotalAll.setUnstableTotalHigh(tr.getUnstableTotalHigh());
				unstableTotalAll.setUnstableTotalNormal(tr.getUnstableTotalNormal());
				unstableTotalAll.setUnstableTotalLow(tr.getUnstableTotalLow());
				System.out.println(unstableTotalAll);
			} else {
				unstableTotalAll = new UnstableTotalAll();
				unstableTotalAll.setFlagUnstableTotalAll(false);
				System.out.println(unstableTotalAll);

			}
			jenkinesReader.setCheckstyleThreshold(
					Checkstyle.builder().Failed(Failed).unstableTotalAll(unstableTotalAll).isCheckstyle(true).build());
		} else {
			jenkinesReader.setCheckstyleThreshold(
					Checkstyle.builder().Failed(new FailedToAll()).unstableTotalAll(new UnstableTotalAll())
							.pluginCheckstyle("CHECKSTYLE").isCheckstyle(false).build());
		}

		if (report.getHudsonPluginsPmdPmdReporter() != null
				&& report.getHudsonPluginsPmdPmdReporter().getPluginName().trim().equals("[PMD]")) {

			tr = report.getHudsonPluginsPmdPmdReporter().getThresholds();

			if (tr.getFailedTotalAll() != "" || tr.getFailedTotalHigh().trim() != ""
					|| tr.getFailedTotalLow().trim() != "" || tr.getFailedTotalNormal().trim() != "") {

				Failed.setFlagFailedToAll(true);
				Failed.setFailedTotalAll(tr.getFailedTotalAll());
				Failed.setFailedTotalHigh(tr.getFailedTotalHigh());
				Failed.setFailedTotalNormal(tr.getFailedTotalNormal());
				Failed.setFailedTotalLow(tr.getFailedTotalLow());
				System.out.println(Failed);
			} else {

				Failed = new FailedToAll();
				Failed.setFlagFailedToAll(false);
				System.out.println(Failed);
			}
			if (tr.getUnstableTotalAll() != "" || tr.getUnstableTotalHigh().trim() != ""
					|| tr.getUnstableTotalLow().trim() != "" || tr.getUnstableTotalNormal().trim() != "") {

				unstableTotalAll = new UnstableTotalAll();
				unstableTotalAll.setFlagUnstableTotalAll(true);
				unstableTotalAll.setUnstableTotalAll(tr.getUnstableTotalAll());
				unstableTotalAll.setUnstableTotalHigh(tr.getUnstableTotalHigh());
				unstableTotalAll.setUnstableTotalNormal(tr.getUnstableTotalNormal());
				unstableTotalAll.setUnstableTotalLow(tr.getUnstableTotalLow());
				System.out.println(unstableTotalAll);
			} else {
				unstableTotalAll = new UnstableTotalAll();
				unstableTotalAll.setFlagUnstableTotalAll(false);
				System.out.println(unstableTotalAll);

			}
			jenkinesReader.setPmdThreshold(
					PMD.builder().Failed(Failed).unstableTotalAll(unstableTotalAll).isPMD(true).build());
		} else {
			jenkinesReader.setPmdThreshold(PMD.builder().Failed(new FailedToAll())
					.unstableTotalAll(new UnstableTotalAll()).isPMD(false).build());
		}

		return jenkinesReader;
	}
}
