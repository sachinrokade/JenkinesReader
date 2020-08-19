package com.jenkiens.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLStreamException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jenkiens.controller.JekinesControler;
import com.jenkiens.pojo.JenkinesReader;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class JekinesConfigReportService {

	@Autowired
	JekinesConfigService config;

	public void getRepo()
			throws XMLStreamException, IOException, FactoryConfigurationError, NoPluginSpecifieException {

		/*List<Entry<String, JenkinesReader>> j = config.configReport().entrySet().stream().filter(
				a -> a.getValue().getPmdThreshold().isPMD() || a.getValue().getCheckstyleThreshold().isCheckstyle())
				.collect(Collectors.toList());

		System.out.println("***********************Reporting*********************************  ");
		j.forEach(System.out::println);*/

		Map<String, JenkinesReader> data = config.configReport();
		@SuppressWarnings("resource")
		HSSFWorkbook workbook = new HSSFWorkbook();

		HSSFSheet checkSheet = workbook.createSheet("Checkstyle");
		HSSFSheet pmdSheet = workbook.createSheet("PMD");

		int rowCIndex = 0;
		int rowpIndex = 0;

		setdSheet(checkSheet, rowCIndex++);
		setdSheet(pmdSheet, rowpIndex++);
		for (Map.Entry<String, JenkinesReader> entry : data.entrySet()) {

		log.info("hfdlnnnnnnnnnnnnnn "+entry.getValue().getCheckstyleThreshold());
		log.info("hfdlnnnnnnnnnnnnnn "+entry.getValue().getPmdThreshold());
				if (entry.getValue().getCheckstyleThreshold().isCheckstyle()) {

					if (entry.getValue().getCheckstyleThreshold().getFailed().isFlagFailedToAll()) {
						Row row = checkSheet.createRow(rowCIndex++);

						row.createCell(0).setCellValue(entry.getKey());
						row.createCell(1).setCellValue(
								"" + entry.getValue().getCheckstyleThreshold().getFailed().getFailedTotalAll());
						row.createCell(2).setCellValue(
								entry.getValue().getCheckstyleThreshold().getFailed().getFailedTotalHigh());
						row.createCell(3).setCellValue(
								entry.getValue().getCheckstyleThreshold().getFailed().getFailedTotalNormal());
						row.createCell(4).setCellValue(
								entry.getValue().getCheckstyleThreshold().getFailed().getFailedTotalLow());
						row.createCell(5).setCellValue("Failed");

					} else if (entry.getValue().getCheckstyleThreshold().getUnstableTotalAll()
							.isFlagUnstableTotalAll()) {
						Row rowUn = checkSheet.createRow(rowCIndex++);
						rowUn.createCell(0).setCellValue(entry.getKey());
						rowUn.createCell(1).setCellValue("" + entry.getValue().getCheckstyleThreshold()
								.getUnstableTotalAll().getUnstableTotalAll());
						rowUn.createCell(2).setCellValue("" + entry.getValue().getCheckstyleThreshold()
								.getUnstableTotalAll().getUnstableTotalHigh());
						rowUn.createCell(3).setCellValue("" + entry.getValue().getCheckstyleThreshold()
								.getUnstableTotalAll().getUnstableTotalNormal());
						rowUn.createCell(4).setCellValue("" + entry.getValue().getCheckstyleThreshold()
								.getUnstableTotalAll().getUnstableTotalLow());
						rowUn.createCell(5).setCellValue("Unstable");
					}

				} else {

					if (entry.getValue().getCheckstyleThreshold().getFailed().isFlagFailedToAll() == false) {
						Row row = checkSheet.createRow(rowpIndex++);

						row.createCell(0).setCellValue(entry.getKey());
						row.createCell(1).setCellValue("NA");
						row.createCell(2).setCellValue("NA");
						row.createCell(3).setCellValue("NA");
						row.createCell(4).setCellValue("NA");
						row.createCell(5).setCellValue("No found");

					} else if (entry.getValue().getCheckstyleThreshold().getUnstableTotalAll()
							.isFlagUnstableTotalAll() == false) {
						Row rowUn = checkSheet.createRow(rowpIndex);
						rowUn.createCell(0).setCellValue(entry.getKey());
						rowUn.createCell(1).setCellValue("NA");
						rowUn.createCell(2).setCellValue("NA");
						rowUn.createCell(3).setCellValue("NA");
						rowUn.createCell(4).setCellValue("NA");
						rowUn.createCell(5).setCellValue("No found");
					}
				}
				if (entry.getValue().getPmdThreshold().isPMD()) {
					// PMD

					if (entry.getValue().getPmdThreshold().getFailed().isFlagFailedToAll()) {
						Row row = pmdSheet.createRow(rowpIndex++);

						row.createCell(0).setCellValue(entry.getKey());
						row.createCell(1)
								.setCellValue("" + entry.getValue().getPmdThreshold().getFailed().getFailedTotalAll());
						row.createCell(2)
								.setCellValue(entry.getValue().getPmdThreshold().getFailed().getFailedTotalHigh());
						row.createCell(3)
								.setCellValue(entry.getValue().getPmdThreshold().getFailed().getFailedTotalNormal());
						row.createCell(4)
								.setCellValue(entry.getValue().getPmdThreshold().getFailed().getFailedTotalLow());
						row.createCell(5).setCellValue("Failed");

					} else if (entry.getValue().getPmdThreshold().getUnstableTotalAll().isFlagUnstableTotalAll()) {
						Row rowUn = pmdSheet.createRow(rowpIndex);
						rowUn.createCell(0).setCellValue(entry.getKey());
						rowUn.createCell(1).setCellValue(
								"" + entry.getValue().getPmdThreshold().getUnstableTotalAll().getUnstableTotalAll());
						rowUn.createCell(2).setCellValue(
								"" + entry.getValue().getPmdThreshold().getUnstableTotalAll().getUnstableTotalHigh());
						rowUn.createCell(3).setCellValue(
								"" + entry.getValue().getPmdThreshold().getUnstableTotalAll().getUnstableTotalNormal());
						rowUn.createCell(4).setCellValue(
								"" + entry.getValue().getPmdThreshold().getUnstableTotalAll().getUnstableTotalLow());
						rowUn.createCell(5).setCellValue("Unstable");
					}

				} else {

					if (entry.getValue().getPmdThreshold().getFailed().isFlagFailedToAll() == false) {
						Row row = pmdSheet.createRow(rowpIndex++);

						row.createCell(0).setCellValue(entry.getKey());
						row.createCell(1).setCellValue("NA");
						row.createCell(2).setCellValue("NA");
						row.createCell(3).setCellValue("NA");
						row.createCell(4).setCellValue("NA");
						row.createCell(5).setCellValue("No found");

					} else if (entry.getValue().getCheckstyleThreshold().getUnstableTotalAll()
							.isFlagUnstableTotalAll() == false) {
						Row rowUn = pmdSheet.createRow(rowpIndex);
						rowUn.createCell(0).setCellValue(entry.getKey());
						rowUn.createCell(1).setCellValue("NA");
						rowUn.createCell(2).setCellValue("NA");
						rowUn.createCell(3).setCellValue("NA");
						rowUn.createCell(4).setCellValue("NA");
						rowUn.createCell(5).setCellValue("No found");
					}

				}
			}
		// lets write the excel data to file now
		Calendar cal = Calendar.getInstance();
		cal.setTime(Date.from(Instant.now()));

		// Create a filename from a format string.
		// ... Apply date formatting codes.
		String result = String.format("CodeQulityThreshod-%1$tY-%1$tm-%1$td-%1$tk-%1$tS-%1$tp.xlsx", cal);
		File f = new File(result);
		FileOutputStream fos = new FileOutputStream(f);
		workbook.write(fos);
		fos.close();
		System.out.println(" written successfully");

	//	return j;
		//
	}

	public void setdSheet(HSSFSheet chelSheet, int rowIndex) {
		Row rowHader = chelSheet.createRow(rowIndex);
		rowHader.createCell(0).setCellValue("Project");
		rowHader.createCell(1).setCellValue("All");
		rowHader.createCell(2).setCellValue("High");
		rowHader.createCell(3).setCellValue("Normal");
		rowHader.createCell(4).setCellValue("Low");
		rowHader.createCell(5).setCellValue("Type");

	}
}
