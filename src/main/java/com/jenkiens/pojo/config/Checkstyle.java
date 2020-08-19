package com.jenkiens.pojo.config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Checkstyle {

	FailedToAll Failed;
	UnstableTotalAll unstableTotalAll;
	String pluginCheckstyle;
	boolean isCheckstyle;
	
	
}
