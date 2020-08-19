package com.jenkiens.JenkinesReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.jenkiens","com.jenkines.file.reader.JenkinesConfigXls"})
@ConfigurationPropertiesScan("com.jenkiens")
public class JenkinesReaderApplication extends  SpringBootServletInitializer {
	   @Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	      return application.sources(JenkinesReaderApplication.class);
	   }
	public static void main(String[] args) {

		SpringApplication.run(JenkinesReaderApplication.class, args);
		
		
	}

}
