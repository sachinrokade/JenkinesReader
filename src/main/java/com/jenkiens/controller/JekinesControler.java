package com.jenkiens.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLStreamException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import com.jenkiens.exception.NoConfigFoundException;
import com.jenkiens.exception.NoFailedJobException;
import com.jenkiens.pojo.JenkinesReader;
import com.jenkiens.pojo.Job;
import com.jenkiens.service.JekinesConfigService;
import com.jenkiens.service.NoPluginSpecifieException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class JekinesControler {

	@Autowired
	JekinesConfigService con;

	@GetMapping(value={"/","/failed"},produces=MediaType.APPLICATION_JSON_VALUE) 
	public ResponseEntity<Object> getfailed() throws NoFailedJobException {
		System.out.println("**************************************");

		List<Job> listFailedjob = con.findFailedJobs();

		if (!listFailedjob.isEmpty())
			return new ResponseEntity<Object>(listFailedjob, HttpStatus.OK);
		else
			return new ResponseEntity<Object>("NO_CONTENT", HttpStatus.NO_CONTENT);
	}

	@GetMapping(value="/getConfig",produces=MediaType.APPLICATION_JSON_VALUE) 
	public ResponseEntity<Map<String, JenkinesReader>> getConfig() throws XMLStreamException, IOException, NoConfigFoundException, FactoryConfigurationError, NoPluginSpecifieException {

		
		System.out.println("***************** getConfig*********************");
		Map<String, JenkinesReader> config=con.configReport();
		
		if (!config.isEmpty())
			return new ResponseEntity<Map<String, JenkinesReader>>(config, HttpStatus.OK);
		else
			throw new NoConfigFoundException("enable to read Config");

		// return con.configReport();
	}
	
	
	@GetMapping(value="/getThreshold",produces=MediaType.APPLICATION_JSON_VALUE) 
	public List<JenkinesReader> getThreshold() throws HttpClientErrorException {
		
		return con.findThreshold();

	}

}
