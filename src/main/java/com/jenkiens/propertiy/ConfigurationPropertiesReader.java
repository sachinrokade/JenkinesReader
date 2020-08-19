package com.jenkiens.propertiy;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import lombok.Data;
import lombok.ToString;

@Service
@ConfigurationProperties(prefix="jenkines")
@Data
@ToString
public class ConfigurationPropertiesReader {
	
		String base_url;//http://localhost:8080
		String project_url;//http://localhost:8080/job/[project]/
		String api_json;///api/json
		List<String> projectlist;//microservice,Rest-Curd
		String uname;//admin
		String pass;//admin

}
