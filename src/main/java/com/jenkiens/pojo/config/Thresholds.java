
package com.jenkiens.pojo.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "plugin",
    "unstableTotalAll",
    "unstableTotalHigh",
    "unstableTotalNormal",
    "unstableTotalLow",
    "unstableNewAll",
    "unstableNewHigh",
    "unstableNewNormal",
    "unstableNewLow",
    "failedTotalAll",
    "failedTotalHigh",
    "failedTotalNormal",
    "failedTotalLow",
    "failedNewAll",
    "failedNewHigh",
    "failedNewNormal",
    "failedNewLow"
})
public class Thresholds {

    @JsonProperty("plugin")
    private String plugin;
   
    @JsonProperty("unstableTotalAll")
    private Object unstableTotalAll;
    @JsonProperty("unstableTotalHigh")
    private String unstableTotalHigh;
    @JsonProperty("unstableTotalNormal")
    private String unstableTotalNormal;
    @JsonProperty("unstableTotalLow")
    private String unstableTotalLow;
    @JsonProperty("unstableNewAll")
    private Object unstableNewAll;
    @JsonProperty("unstableNewHigh")
    private Object unstableNewHigh;
    @JsonProperty("unstableNewNormal")
    private Object unstableNewNormal;
    @JsonProperty("unstableNewLow")
    private Object unstableNewLow;
    @JsonProperty("failedTotalAll")
    private Object failedTotalAll;
    @JsonProperty("failedTotalHigh")
    private String failedTotalHigh;
    @JsonProperty("failedTotalNormal")
    private String failedTotalNormal;
    @JsonProperty("failedTotalLow")
    private String failedTotalLow;
    @JsonProperty("failedNewAll")
    private Object failedNewAll;
    @JsonProperty("failedNewHigh")
    private Object failedNewHigh;
    @JsonProperty("failedNewNormal")
    private Object failedNewNormal;
    @JsonProperty("failedNewLow")
    private Object failedNewLow;

    
    
    
    
    public Thresholds() {
		super();
		     String plugin="NA";
		     Object unstableTotalAll="NA";
		     String unstableTotalHigh="NA";
		     String unstableTotalNormal="NA";
		     String unstableTotalLow="NA";
		     Object unstableNewAll="NA";
		     Object unstableNewHigh="NA";
		     Object unstableNewNormal="NA";
		     Object unstableNewLow="NA";
		     Object failedTotalAll="NA";
		     String failedTotalHigh="NA";
		     String failedTotalNormal="NA";
		     String failedTotalLow="NA";
		     Object failedNewAll="NA";
		     Object failedNewHigh="NA";
		     Object failedNewNormal="NA";
		     Object failedNewLow="NA";

	}

	@JsonProperty("plugin")
    public String getPlugin() {
        return plugin;
    }

    @JsonProperty("plugin")
    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    @JsonProperty("unstableTotalAll")
    public Object getUnstableTotalAll() {
        return unstableTotalAll;
    }

    @JsonProperty("unstableTotalAll")
    public void setUnstableTotalAll(Object unstableTotalAll) {
        this.unstableTotalAll = unstableTotalAll;
    }

    @JsonProperty("unstableTotalHigh")
    public String getUnstableTotalHigh() {
        return unstableTotalHigh;
    }

    @JsonProperty("unstableTotalHigh")
    public void setUnstableTotalHigh(String unstableTotalHigh) {
        this.unstableTotalHigh = unstableTotalHigh;
    }

    @JsonProperty("unstableTotalNormal")
    public String getUnstableTotalNormal() {
        return unstableTotalNormal;
    }

    @JsonProperty("unstableTotalNormal")
    public void setUnstableTotalNormal(String unstableTotalNormal) {
        this.unstableTotalNormal = unstableTotalNormal;
    }

    @JsonProperty("unstableTotalLow")
    public String getUnstableTotalLow() {
        return unstableTotalLow;
    }

    @JsonProperty("unstableTotalLow")
    public void setUnstableTotalLow(String unstableTotalLow) {
        this.unstableTotalLow = unstableTotalLow;
    }

    @JsonProperty("unstableNewAll")
    public Object getUnstableNewAll() {
        return unstableNewAll;
    }

    @JsonProperty("unstableNewAll")
    public void setUnstableNewAll(Object unstableNewAll) {
        this.unstableNewAll = unstableNewAll;
    }

    @JsonProperty("unstableNewHigh")
    public Object getUnstableNewHigh() {
        return unstableNewHigh;
    }

    @JsonProperty("unstableNewHigh")
    public void setUnstableNewHigh(Object unstableNewHigh) {
        this.unstableNewHigh = unstableNewHigh;
    }

    @JsonProperty("unstableNewNormal")
    public Object getUnstableNewNormal() {
        return unstableNewNormal;
    }

    @JsonProperty("unstableNewNormal")
    public void setUnstableNewNormal(Object unstableNewNormal) {
        this.unstableNewNormal = unstableNewNormal;
    }

    @JsonProperty("unstableNewLow")
    public Object getUnstableNewLow() {
        return unstableNewLow;
    }

    @JsonProperty("unstableNewLow")
    public void setUnstableNewLow(Object unstableNewLow) {
        this.unstableNewLow = unstableNewLow;
    }

    @JsonProperty("failedTotalAll")
    public Object getFailedTotalAll() {
        return failedTotalAll;
    }

    @JsonProperty("failedTotalAll")
    public void setFailedTotalAll(Object failedTotalAll) {
        this.failedTotalAll = failedTotalAll;
    }

    @JsonProperty("failedTotalHigh")
    public String getFailedTotalHigh() {
        return failedTotalHigh;
    }

    @JsonProperty("failedTotalHigh")
    public void setFailedTotalHigh(String failedTotalHigh) {
        this.failedTotalHigh = failedTotalHigh;
    }

    @JsonProperty("failedTotalNormal")
    public String getFailedTotalNormal() {
        return failedTotalNormal;
    }

    @JsonProperty("failedTotalNormal")
    public void setFailedTotalNormal(String failedTotalNormal) {
        this.failedTotalNormal = failedTotalNormal;
    }

    @JsonProperty("failedTotalLow")
    public String getFailedTotalLow() {
        return failedTotalLow;
    }

    @JsonProperty("failedTotalLow")
    public void setFailedTotalLow(String failedTotalLow) {
        this.failedTotalLow = failedTotalLow;
    }

    @JsonProperty("failedNewAll")
    public Object getFailedNewAll() {
        return failedNewAll;
    }

    @JsonProperty("failedNewAll")
    public void setFailedNewAll(Object failedNewAll) {
        this.failedNewAll = failedNewAll;
    }

    @JsonProperty("failedNewHigh")
    public Object getFailedNewHigh() {
        return failedNewHigh;
    }

    @JsonProperty("failedNewHigh")
    public void setFailedNewHigh(Object failedNewHigh) {
        this.failedNewHigh = failedNewHigh;
    }

    @JsonProperty("failedNewNormal")
    public Object getFailedNewNormal() {
        return failedNewNormal;
    }

    @JsonProperty("failedNewNormal")
    public void setFailedNewNormal(Object failedNewNormal) {
        this.failedNewNormal = failedNewNormal;
    }

    @JsonProperty("failedNewLow")
    public Object getFailedNewLow() {
        return failedNewLow;
    }

    @JsonProperty("failedNewLow")
    public void setFailedNewLow(Object failedNewLow) {
        this.failedNewLow = failedNewLow;
    }

}
