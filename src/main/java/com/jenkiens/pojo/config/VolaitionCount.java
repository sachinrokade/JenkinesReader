
package com.jenkiens.pojo.config;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VolaitionCount {

	
    private Boolean newSuccessfulHighScore;
    private Boolean newZeroWarningsHighScore;
    private Long numberOfFixedWarnings;
    private Long numberOfHighPriorityWarnings;
    private Long numberOfLowPriorityWarnings;
    private Long numberOfNewWarnings;
    private Long numberOfNormalPriorityWarnings;
    private Long numberOfWarnings;
    private String pluginResult;
    private Long successfulHighScore;
    private Long successfulSinceBuild;
    private String plugin;
  
}
