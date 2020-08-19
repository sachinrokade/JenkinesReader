package com.jenkiens.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLStreamException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jenkiens.pojo.JenkinesReader;
import com.jenkiens.service.JekinesConfigReportService;
import com.jenkiens.service.NoPluginSpecifieException;

@RestController
public class JekinesReportControler {

	
	
	@Autowired
	JekinesConfigReportService xlsl;
	
	@GetMapping(value="/repo",produces=MediaType.APPLICATION_JSON_VALUE)
	public void hashCode1() throws XMLStreamException, IOException, FactoryConfigurationError, NoPluginSpecifieException {
		
		//List<Entry<String, JenkinesReader>> repoData=
				xlsl.getRepo();
		
		/*repoData.forEach(a->a.getValue());
		return repoData;*/
	}
	
}
