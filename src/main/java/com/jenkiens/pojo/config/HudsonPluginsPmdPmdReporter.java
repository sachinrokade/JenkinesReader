
package com.jenkiens.pojo.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "plugin",
    "healthy",
    "unHealthy",
    "pluginName",
    "thresholdLimit",
    "canRunOnFailed",
    "useDeltaValues",
    "thresholds",
    "dontComputeNew",
    "usePreviousBuildAsReference",
    "useStableBuildAsReference"
})
public class HudsonPluginsPmdPmdReporter {

    @JsonProperty("plugin")
    private String plugin;
    @JsonProperty("healthy")
    private Object healthy;
    @JsonProperty("unHealthy")
    private Object unHealthy;
    @JsonProperty("pluginName")
    private String pluginName;
    @JsonProperty("thresholdLimit")
    private String thresholdLimit;
    @JsonProperty("canRunOnFailed")
    private String canRunOnFailed;
    @JsonProperty("useDeltaValues")
    private String useDeltaValues;
    @JsonProperty("thresholds")
    private Thresholds thresholds;
    @JsonProperty("dontComputeNew")
    private String dontComputeNew;
    @JsonProperty("usePreviousBuildAsReference")
    private String usePreviousBuildAsReference;
    @JsonProperty("useStableBuildAsReference")
    private String useStableBuildAsReference;

    @JsonProperty("plugin")
    public String getPlugin() {
        return plugin;
    }

    @JsonProperty("plugin")
    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    @JsonProperty("healthy")
    public Object getHealthy() {
        return healthy;
    }

    @JsonProperty("healthy")
    public void setHealthy(Object healthy) {
        this.healthy = healthy;
    }

    @JsonProperty("unHealthy")
    public Object getUnHealthy() {
        return unHealthy;
    }

    @JsonProperty("unHealthy")
    public void setUnHealthy(Object unHealthy) {
        this.unHealthy = unHealthy;
    }

    @JsonProperty("pluginName")
    public String getPluginName() {
        return pluginName;
    }

    @JsonProperty("pluginName")
    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    @JsonProperty("thresholdLimit")
    public String getThresholdLimit() {
        return thresholdLimit;
    }

    @JsonProperty("thresholdLimit")
    public void setThresholdLimit(String thresholdLimit) {
        this.thresholdLimit = thresholdLimit;
    }

    @JsonProperty("canRunOnFailed")
    public String getCanRunOnFailed() {
        return canRunOnFailed;
    }

    @JsonProperty("canRunOnFailed")
    public void setCanRunOnFailed(String canRunOnFailed) {
        this.canRunOnFailed = canRunOnFailed;
    }

    @JsonProperty("useDeltaValues")
    public String getUseDeltaValues() {
        return useDeltaValues;
    }

    @JsonProperty("useDeltaValues")
    public void setUseDeltaValues(String useDeltaValues) {
        this.useDeltaValues = useDeltaValues;
    }

    @JsonProperty("thresholds")
    public Thresholds getThresholds() {
        return thresholds;
    }

    @JsonProperty("thresholds")
    public void setThresholds(Thresholds thresholds) {
        this.thresholds = thresholds;
    }

    @JsonProperty("dontComputeNew")
    public String getDontComputeNew() {
        return dontComputeNew;
    }

    @JsonProperty("dontComputeNew")
    public void setDontComputeNew(String dontComputeNew) {
        this.dontComputeNew = dontComputeNew;
    }

    @JsonProperty("usePreviousBuildAsReference")
    public String getUsePreviousBuildAsReference() {
        return usePreviousBuildAsReference;
    }

    @JsonProperty("usePreviousBuildAsReference")
    public void setUsePreviousBuildAsReference(String usePreviousBuildAsReference) {
        this.usePreviousBuildAsReference = usePreviousBuildAsReference;
    }

    @JsonProperty("useStableBuildAsReference")
    public String getUseStableBuildAsReference() {
        return useStableBuildAsReference;
    }

    @JsonProperty("useStableBuildAsReference")
    public void setUseStableBuildAsReference(String useStableBuildAsReference) {
        this.useStableBuildAsReference = useStableBuildAsReference;
    }

}
