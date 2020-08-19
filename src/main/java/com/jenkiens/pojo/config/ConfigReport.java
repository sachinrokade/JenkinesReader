
package com.jenkiens.pojo.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "plugin",
    "actions",
    "description",
    "keepDependencies",
    "properties",
    "scm",
    "canRoam",
    "disabled",
    "blockBuildWhenDownstreamBuilding",
    "blockBuildWhenUpstreamBuilding",
    "triggers",
    "concurrentBuild",
    "rootModule",
    "goals",
    "aggregatorStyleBuild",
    "incrementalBuild",
    "ignoreUpstremChanges",
    "ignoreUnsuccessfulUpstreams",
    "archivingDisabled",
    "siteArchivingDisabled",
    "fingerprintingDisabled",
    "resolveDependencies",
    "processPlugins",
    "mavenValidationLevel",
    "runHeadless",
    "disableTriggerDownstreamProjects",
    "settings",
    "globalSettings",
    "reporters",
    "publishers",
    "buildWrappers",
    "prebuilders",
    "postbuilders",
    "runPostStepsIfResult"
})
public class ConfigReport {

    @JsonProperty("plugin")
    private String plugin;
    @JsonProperty("actions")
    private Object actions;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("keepDependencies")
    private String keepDependencies;
    @JsonProperty("properties")
    private Properties properties;
    @JsonProperty("scm")
    private Scm scm;
    @JsonProperty("canRoam")
    private String canRoam;
    @JsonProperty("disabled")
    private String disabled;
    @JsonProperty("blockBuildWhenDownstreamBuilding")
    private String blockBuildWhenDownstreamBuilding;
    @JsonProperty("blockBuildWhenUpstreamBuilding")
    private String blockBuildWhenUpstreamBuilding;
    @JsonProperty("triggers")
    private Object triggers;
    @JsonProperty("concurrentBuild")
    private String concurrentBuild;
    @JsonProperty("rootModule")
    private RootModule rootModule;
    

    @JsonProperty("rootPOM")
    private String rootPOM;
    @JsonProperty("goals")
    private String goals;
    @JsonProperty("aggregatorStyleBuild")
    private String aggregatorStyleBuild;
    @JsonProperty("incrementalBuild")
    private String incrementalBuild;
    @JsonProperty("ignoreUpstremChanges")
    private String ignoreUpstremChanges;
    @JsonProperty("ignoreUnsuccessfulUpstreams")
    private String ignoreUnsuccessfulUpstreams;
    @JsonProperty("archivingDisabled")
    private String archivingDisabled;
    @JsonProperty("siteArchivingDisabled")
    private String siteArchivingDisabled;
    @JsonProperty("fingerprintingDisabled")
    private String fingerprintingDisabled;
    @JsonProperty("resolveDependencies")
    private String resolveDependencies;
    @JsonProperty("processPlugins")
    private String processPlugins;
    @JsonProperty("mavenValidationLevel")
    private String mavenValidationLevel;
    @JsonProperty("runHeadless")
    private String runHeadless;
    @JsonProperty("disableTriggerDownstreamProjects")
    private String disableTriggerDownstreamProjects;
    @JsonProperty("settings")
    private Settings settings;
    @JsonProperty("globalSettings")
    private GlobalSettings globalSettings;
    @JsonProperty("reporters")
    private Reporters reporters;
    @JsonProperty("publishers")
    private Publishers publishers;
    @JsonProperty("buildWrappers")
    private Object buildWrappers;
    @JsonProperty("prebuilders")
    private Object prebuilders;
    @JsonProperty("postbuilders")
    private Object postbuilders;
    @JsonProperty("runPostStepsIfResult")
    private RunPostStepsIfResult runPostStepsIfResult;

    @JsonProperty("plugin")
    public String getPlugin() {
        return plugin;
    }

    @JsonProperty("plugin")
    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }
    



    @JsonProperty("rootPOM")
    public String getRootPOM() {
		return rootPOM;
	}

    @JsonProperty("rootPOM")
	public void setRootPOM(String rootPOM) {
		this.rootPOM = rootPOM;
	}

	@JsonProperty("actions")
    public Object getActions() {
        return actions;
    }

    @JsonProperty("actions")
    public void setActions(Object actions) {
        this.actions = actions;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("keepDependencies")
    public String getKeepDependencies() {
        return keepDependencies;
    }

    @JsonProperty("keepDependencies")
    public void setKeepDependencies(String keepDependencies) {
        this.keepDependencies = keepDependencies;
    }

    @JsonProperty("properties")
    public Properties getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @JsonProperty("scm")
    public Scm getScm() {
        return scm;
    }

    @JsonProperty("scm")
    public void setScm(Scm scm) {
        this.scm = scm;
    }

    @JsonProperty("canRoam")
    public String getCanRoam() {
        return canRoam;
    }

    @JsonProperty("canRoam")
    public void setCanRoam(String canRoam) {
        this.canRoam = canRoam;
    }

    @JsonProperty("disabled")
    public String getDisabled() {
        return disabled;
    }

    @JsonProperty("disabled")
    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    @JsonProperty("blockBuildWhenDownstreamBuilding")
    public String getBlockBuildWhenDownstreamBuilding() {
        return blockBuildWhenDownstreamBuilding;
    }

    @JsonProperty("blockBuildWhenDownstreamBuilding")
    public void setBlockBuildWhenDownstreamBuilding(String blockBuildWhenDownstreamBuilding) {
        this.blockBuildWhenDownstreamBuilding = blockBuildWhenDownstreamBuilding;
    }

    @JsonProperty("blockBuildWhenUpstreamBuilding")
    public String getBlockBuildWhenUpstreamBuilding() {
        return blockBuildWhenUpstreamBuilding;
    }

    @JsonProperty("blockBuildWhenUpstreamBuilding")
    public void setBlockBuildWhenUpstreamBuilding(String blockBuildWhenUpstreamBuilding) {
        this.blockBuildWhenUpstreamBuilding = blockBuildWhenUpstreamBuilding;
    }

    @JsonProperty("triggers")
    public Object getTriggers() {
        return triggers;
    }

    @JsonProperty("triggers")
    public void setTriggers(Object triggers) {
        this.triggers = triggers;
    }

    @JsonProperty("concurrentBuild")
    public String getConcurrentBuild() {
        return concurrentBuild;
    }

    @JsonProperty("concurrentBuild")
    public void setConcurrentBuild(String concurrentBuild) {
        this.concurrentBuild = concurrentBuild;
    }

    @JsonProperty("rootModule")
    public RootModule getRootModule() {
        return rootModule;
    }

    @JsonProperty("rootModule")
    public void setRootModule(RootModule rootModule) {
        this.rootModule = rootModule;
    }

    @JsonProperty("goals")
    public String getGoals() {
        return goals;
    }

    @JsonProperty("goals")
    public void setGoals(String goals) {
        this.goals = goals;
    }

    @JsonProperty("aggregatorStyleBuild")
    public String getAggregatorStyleBuild() {
        return aggregatorStyleBuild;
    }

    @JsonProperty("aggregatorStyleBuild")
    public void setAggregatorStyleBuild(String aggregatorStyleBuild) {
        this.aggregatorStyleBuild = aggregatorStyleBuild;
    }

    @JsonProperty("incrementalBuild")
    public String getIncrementalBuild() {
        return incrementalBuild;
    }

    @JsonProperty("incrementalBuild")
    public void setIncrementalBuild(String incrementalBuild) {
        this.incrementalBuild = incrementalBuild;
    }

    @JsonProperty("ignoreUpstremChanges")
    public String getIgnoreUpstremChanges() {
        return ignoreUpstremChanges;
    }

    @JsonProperty("ignoreUpstremChanges")
    public void setIgnoreUpstremChanges(String ignoreUpstremChanges) {
        this.ignoreUpstremChanges = ignoreUpstremChanges;
    }

    @JsonProperty("ignoreUnsuccessfulUpstreams")
    public String getIgnoreUnsuccessfulUpstreams() {
        return ignoreUnsuccessfulUpstreams;
    }

    @JsonProperty("ignoreUnsuccessfulUpstreams")
    public void setIgnoreUnsuccessfulUpstreams(String ignoreUnsuccessfulUpstreams) {
        this.ignoreUnsuccessfulUpstreams = ignoreUnsuccessfulUpstreams;
    }

    @JsonProperty("archivingDisabled")
    public String getArchivingDisabled() {
        return archivingDisabled;
    }

    @JsonProperty("archivingDisabled")
    public void setArchivingDisabled(String archivingDisabled) {
        this.archivingDisabled = archivingDisabled;
    }

    @JsonProperty("siteArchivingDisabled")
    public String getSiteArchivingDisabled() {
        return siteArchivingDisabled;
    }

    @JsonProperty("siteArchivingDisabled")
    public void setSiteArchivingDisabled(String siteArchivingDisabled) {
        this.siteArchivingDisabled = siteArchivingDisabled;
    }

    @JsonProperty("fingerprintingDisabled")
    public String getFingerprintingDisabled() {
        return fingerprintingDisabled;
    }

    @JsonProperty("fingerprintingDisabled")
    public void setFingerprintingDisabled(String fingerprintingDisabled) {
        this.fingerprintingDisabled = fingerprintingDisabled;
    }

    @JsonProperty("resolveDependencies")
    public String getResolveDependencies() {
        return resolveDependencies;
    }

    @JsonProperty("resolveDependencies")
    public void setResolveDependencies(String resolveDependencies) {
        this.resolveDependencies = resolveDependencies;
    }

    @JsonProperty("processPlugins")
    public String getProcessPlugins() {
        return processPlugins;
    }

    @JsonProperty("processPlugins")
    public void setProcessPlugins(String processPlugins) {
        this.processPlugins = processPlugins;
    }

    @JsonProperty("mavenValidationLevel")
    public String getMavenValidationLevel() {
        return mavenValidationLevel;
    }

    @JsonProperty("mavenValidationLevel")
    public void setMavenValidationLevel(String mavenValidationLevel) {
        this.mavenValidationLevel = mavenValidationLevel;
    }

    @JsonProperty("runHeadless")
    public String getRunHeadless() {
        return runHeadless;
    }

    @JsonProperty("runHeadless")
    public void setRunHeadless(String runHeadless) {
        this.runHeadless = runHeadless;
    }

    @JsonProperty("disableTriggerDownstreamProjects")
    public String getDisableTriggerDownstreamProjects() {
        return disableTriggerDownstreamProjects;
    }

    @JsonProperty("disableTriggerDownstreamProjects")
    public void setDisableTriggerDownstreamProjects(String disableTriggerDownstreamProjects) {
        this.disableTriggerDownstreamProjects = disableTriggerDownstreamProjects;
    }

    @JsonProperty("settings")
    public Settings getSettings() {
        return settings;
    }

    @JsonProperty("settings")
    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    @JsonProperty("globalSettings")
    public GlobalSettings getGlobalSettings() {
        return globalSettings;
    }

    @JsonProperty("globalSettings")
    public void setGlobalSettings(GlobalSettings globalSettings) {
        this.globalSettings = globalSettings;
    }

    @JsonProperty("reporters")
    public Reporters getReporters() {
        return reporters;
    }

    @JsonProperty("reporters")
    public void setReporters(Reporters reporters) {
        this.reporters = reporters;
    }

    @JsonProperty("publishers")
    public Publishers getPublishers() {
        return publishers;
    }

    @JsonProperty("publishers")
    public void setPublishers(Publishers publishers) {
        this.publishers = publishers;
    }

    @JsonProperty("buildWrappers")
    public Object getBuildWrappers() {
        return buildWrappers;
    }

    @JsonProperty("buildWrappers")
    public void setBuildWrappers(Object buildWrappers) {
        this.buildWrappers = buildWrappers;
    }

    @JsonProperty("prebuilders")
    public Object getPrebuilders() {
        return prebuilders;
    }

    @JsonProperty("prebuilders")
    public void setPrebuilders(Object prebuilders) {
        this.prebuilders = prebuilders;
    }

    @JsonProperty("postbuilders")
    public Object getPostbuilders() {
        return postbuilders;
    }

    @JsonProperty("postbuilders")
    public void setPostbuilders(Object postbuilders) {
        this.postbuilders = postbuilders;
    }

    @JsonProperty("runPostStepsIfResult")
    public RunPostStepsIfResult getRunPostStepsIfResult() {
        return runPostStepsIfResult;
    }

    @JsonProperty("runPostStepsIfResult")
    public void setRunPostStepsIfResult(RunPostStepsIfResult runPostStepsIfResult) {
        this.runPostStepsIfResult = runPostStepsIfResult;
    }

}
