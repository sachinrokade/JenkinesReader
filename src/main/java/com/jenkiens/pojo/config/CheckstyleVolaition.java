package com.jenkiens.pojo.config;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class CheckstyleVolaition {

	public Long numberOfHighPriorityWarnings;
	public Long numberOfLowPriorityWarnings;
	public Long numberOfNormalPriorityWarnings;
	public Long numberOfWarnings;
	public String pluginResult;

//	
//	VolaitionCount volaitionCount;
//	public Boolean newSuccessfulHighScore;
//    public Boolean newZeroWarningsHighScore;
//    public Long numberOfFixedWarnings;
//    public Long numberOfNewWarnings;
//    public String pluginResult;
//    public Long successfulHighScore;
//    public Long successfulSinceBuild;
}
