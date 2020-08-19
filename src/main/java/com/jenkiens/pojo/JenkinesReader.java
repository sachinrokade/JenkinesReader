package com.jenkiens.pojo;

import com.jenkiens.pojo.config.Checkstyle;
import com.jenkiens.pojo.config.CheckstyleVolaition;
import com.jenkiens.pojo.config.LastSuccessfulBuild;
import com.jenkiens.pojo.config.PMD;
import com.jenkiens.pojo.config.PMDVolaition;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class JenkinesReader {

	
	String projectName; 
	
	PMD pmdThreshold;
	Checkstyle checkstyleThreshold;
	
	CheckstyleVolaition checkstyleVolaition;
	PMDVolaition pmdVolaition;

	
	
	String configUrl;
	String pluginDetails;
	LastSuccessfulBuild lastSuccessfulBuild;
}
