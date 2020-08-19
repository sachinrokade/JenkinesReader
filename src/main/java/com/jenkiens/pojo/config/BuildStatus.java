
package com.jenkiens.pojo.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_class",
    "actions",
    "description",
    "displayName",
    "displayNameOrNull",
    "fullDisplayName",
    "fullName",
    "name",
    "url",
    "buildable",
    "builds",
    "color",
    "firstBuild",
    "healthReport",
    "inQueue",
    "keepDependencies",
    "lastBuild",
    "lastCompletedBuild",
    "lastFailedBuild",
    "lastStableBuild",
    "lastSuccessfulBuild",
    "lastUnstableBuild",
    "lastUnsuccessfulBuild",
    "nextBuildNumber",
    "property",
    "queueItem",
    "concurrentBuild",
    "disabled",
    "downstreamProjects",
    "labelExpression",
    "scm",
    "upstreamProjects",
    "modules"
})
@ToString
public class BuildStatus {

    @JsonProperty("_class")
    private String _class;
    @JsonProperty("actions")
    private List<Action> actions = null;
    @JsonProperty("description")
    private String description;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("displayNameOrNull")
    private Object displayNameOrNull;
    @JsonProperty("fullDisplayName")
    private String fullDisplayName;
    @JsonProperty("fullName")
    private String fullName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;
    @JsonProperty("buildable")
    private Boolean buildable;
    @JsonProperty("builds")
    private List<Build> builds = null;
    @JsonProperty("color")
    private String color;
    @JsonProperty("firstBuild")
    private FirstBuild firstBuild;
    @JsonProperty("healthReport")
    private List<HealthReport> healthReport = null;
    @JsonProperty("inQueue")
    private Boolean inQueue;
    @JsonProperty("keepDependencies")
    private Boolean keepDependencies;
    @JsonProperty("lastBuild")
    private LastBuild lastBuild;
    @JsonProperty("lastCompletedBuild")
    private LastCompletedBuild lastCompletedBuild;
    @JsonProperty("lastFailedBuild")
    private LastFailedBuild lastFailedBuild;
    @JsonProperty("lastStableBuild")
    private LastStableBuild lastStableBuild;
    @JsonProperty("lastSuccessfulBuild")
    private LastSuccessfulBuild lastSuccessfulBuild;
    @JsonProperty("lastUnstableBuild")
    private LastUnstableBuild lastUnstableBuild;
    @JsonProperty("lastUnsuccessfulBuild")
    private LastUnsuccessfulBuild lastUnsuccessfulBuild;
    @JsonProperty("nextBuildNumber")
    private Integer nextBuildNumber;
    @JsonProperty("property")
    private List<Property> property = null;
    @JsonProperty("queueItem")
    private Object queueItem;
    @JsonProperty("concurrentBuild")
    private Boolean concurrentBuild;
    @JsonProperty("disabled")
    private Boolean disabled;
    @JsonProperty("downstreamProjects")
    private List<Object> downstreamProjects = null;
    @JsonProperty("labelExpression")
    private Object labelExpression;
    @JsonProperty("scm")
    private Scm scm;
    @JsonProperty("upstreamProjects")
    private List<Object> upstreamProjects = null;
    @JsonProperty("modules")
    private List<Module> modules = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_class")
    public String getClass_() {
        return _class;
    }

    @JsonProperty("_class")
    public void setClass_(String _class) {
        this._class = _class;
    }

    @JsonProperty("actions")
    public List<Action> getActions() {
        return actions;
    }

    @JsonProperty("actions")
    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("displayNameOrNull")
    public Object getDisplayNameOrNull() {
        return displayNameOrNull;
    }

    @JsonProperty("displayNameOrNull")
    public void setDisplayNameOrNull(Object displayNameOrNull) {
        this.displayNameOrNull = displayNameOrNull;
    }

    @JsonProperty("fullDisplayName")
    public String getFullDisplayName() {
        return fullDisplayName;
    }

    @JsonProperty("fullDisplayName")
    public void setFullDisplayName(String fullDisplayName) {
        this.fullDisplayName = fullDisplayName;
    }

    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("buildable")
    public Boolean getBuildable() {
        return buildable;
    }

    @JsonProperty("buildable")
    public void setBuildable(Boolean buildable) {
        this.buildable = buildable;
    }

    @JsonProperty("builds")
    public List<Build> getBuilds() {
        return builds;
    }

    @JsonProperty("builds")
    public void setBuilds(List<Build> builds) {
        this.builds = builds;
    }

    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    @JsonProperty("firstBuild")
    public FirstBuild getFirstBuild() {
        return firstBuild;
    }

    @JsonProperty("firstBuild")
    public void setFirstBuild(FirstBuild firstBuild) {
        this.firstBuild = firstBuild;
    }

    @JsonProperty("healthReport")
    public List<HealthReport> getHealthReport() {
        return healthReport;
    }

    @JsonProperty("healthReport")
    public void setHealthReport(List<HealthReport> healthReport) {
        this.healthReport = healthReport;
    }

    @JsonProperty("inQueue")
    public Boolean getInQueue() {
        return inQueue;
    }

    @JsonProperty("inQueue")
    public void setInQueue(Boolean inQueue) {
        this.inQueue = inQueue;
    }

    @JsonProperty("keepDependencies")
    public Boolean getKeepDependencies() {
        return keepDependencies;
    }

    @JsonProperty("keepDependencies")
    public void setKeepDependencies(Boolean keepDependencies) {
        this.keepDependencies = keepDependencies;
    }

    @JsonProperty("lastBuild")
    public LastBuild getLastBuild() {
        return lastBuild;
    }

    @JsonProperty("lastBuild")
    public void setLastBuild(LastBuild lastBuild) {
        this.lastBuild = lastBuild;
    }

    @JsonProperty("lastCompletedBuild")
    public LastCompletedBuild getLastCompletedBuild() {
        return lastCompletedBuild;
    }

    @JsonProperty("lastCompletedBuild")
    public void setLastCompletedBuild(LastCompletedBuild lastCompletedBuild) {
        this.lastCompletedBuild = lastCompletedBuild;
    }

    @JsonProperty("lastFailedBuild")
    public LastFailedBuild getLastFailedBuild() {
        return lastFailedBuild;
    }

    @JsonProperty("lastFailedBuild")
    public void setLastFailedBuild(LastFailedBuild lastFailedBuild) {
        this.lastFailedBuild = lastFailedBuild;
    }

    @JsonProperty("lastStableBuild")
    public LastStableBuild getLastStableBuild() {
        return lastStableBuild;
    }

    @JsonProperty("lastStableBuild")
    public void setLastStableBuild(LastStableBuild lastStableBuild) {
        this.lastStableBuild = lastStableBuild;
    }

    @JsonProperty("lastSuccessfulBuild")
    public LastSuccessfulBuild getLastSuccessfulBuild() {
        return lastSuccessfulBuild;
    }

    @JsonProperty("lastSuccessfulBuild")
    public void setLastSuccessfulBuild(LastSuccessfulBuild lastSuccessfulBuild) {
        this.lastSuccessfulBuild = lastSuccessfulBuild;
    }

    @JsonProperty("lastUnstableBuild")
    public LastUnstableBuild getLastUnstableBuild() {
        return lastUnstableBuild;
    }

    @JsonProperty("lastUnstableBuild")
    public void setLastUnstableBuild(LastUnstableBuild lastUnstableBuild) {
        this.lastUnstableBuild = lastUnstableBuild;
    }

    @JsonProperty("lastUnsuccessfulBuild")
    public LastUnsuccessfulBuild getLastUnsuccessfulBuild() {
        return lastUnsuccessfulBuild;
    }

    @JsonProperty("lastUnsuccessfulBuild")
    public void setLastUnsuccessfulBuild(LastUnsuccessfulBuild lastUnsuccessfulBuild) {
        this.lastUnsuccessfulBuild = lastUnsuccessfulBuild;
    }

    @JsonProperty("nextBuildNumber")
    public Integer getNextBuildNumber() {
        return nextBuildNumber;
    }

    @JsonProperty("nextBuildNumber")
    public void setNextBuildNumber(Integer nextBuildNumber) {
        this.nextBuildNumber = nextBuildNumber;
    }

    @JsonProperty("property")
    public List<Property> getProperty() {
        return property;
    }

    @JsonProperty("property")
    public void setProperty(List<Property> property) {
        this.property = property;
    }

    @JsonProperty("queueItem")
    public Object getQueueItem() {
        return queueItem;
    }

    @JsonProperty("queueItem")
    public void setQueueItem(Object queueItem) {
        this.queueItem = queueItem;
    }

    @JsonProperty("concurrentBuild")
    public Boolean getConcurrentBuild() {
        return concurrentBuild;
    }

    @JsonProperty("concurrentBuild")
    public void setConcurrentBuild(Boolean concurrentBuild) {
        this.concurrentBuild = concurrentBuild;
    }

    @JsonProperty("disabled")
    public Boolean getDisabled() {
        return disabled;
    }

    @JsonProperty("disabled")
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    @JsonProperty("downstreamProjects")
    public List<Object> getDownstreamProjects() {
        return downstreamProjects;
    }

    @JsonProperty("downstreamProjects")
    public void setDownstreamProjects(List<Object> downstreamProjects) {
        this.downstreamProjects = downstreamProjects;
    }

    @JsonProperty("labelExpression")
    public Object getLabelExpression() {
        return labelExpression;
    }

    @JsonProperty("labelExpression")
    public void setLabelExpression(Object labelExpression) {
        this.labelExpression = labelExpression;
    }

    @JsonProperty("scm")
    public Scm getScm() {
        return scm;
    }

    @JsonProperty("scm")
    public void setScm(Scm scm) {
        this.scm = scm;
    }

    @JsonProperty("upstreamProjects")
    public List<Object> getUpstreamProjects() {
        return upstreamProjects;
    }

    @JsonProperty("upstreamProjects")
    public void setUpstreamProjects(List<Object> upstreamProjects) {
        this.upstreamProjects = upstreamProjects;
    }

    @JsonProperty("modules")
    public List<Module> getModules() {
        return modules;
    }

    @JsonProperty("modules")
    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
