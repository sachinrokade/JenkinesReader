package com.jenkiens.pojo.config;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PMD {

	FailedToAll Failed;
	UnstableTotalAll unstableTotalAll;
	String pluginPMD;
	boolean isPMD;
	
}
