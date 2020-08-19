
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

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_class",
    "modules",
    "newSuccessfulHighScore",
    "newWarnings",
    "newZeroWarningsHighScore",
    "numberOfFixedWarnings",
    "numberOfHighPriorityWarnings",
    "numberOfLowPriorityWarnings",
    "numberOfNewWarnings",
    "numberOfNormalPriorityWarnings",
    "numberOfWarnings",
    "pluginResult",
    "referenceBuild",
    "successfulHighScore",
    "successfulSinceBuild",
    "successfulSinceDate",
    "warnings",
    "warningsDelta",
    "zeroWarningsHighScore",
    "zeroWarningsSinceBuild",
    "zeroWarningsSinceDate"
})
@Builder
@Getter
@Setter
public class Volaition {

    @JsonProperty("_class")
    private String _class;
    @JsonProperty("modules")
    private List<String> modules = null;
    @JsonProperty("newSuccessfulHighScore")
    private Boolean newSuccessfulHighScore;
    @JsonProperty("newWarnings")
    private List<NewWarning> newWarnings = null;
    @JsonProperty("newZeroWarningsHighScore")
    private Boolean newZeroWarningsHighScore;
    @JsonProperty("numberOfFixedWarnings")
    private Long numberOfFixedWarnings;
    @JsonProperty("numberOfHighPriorityWarnings")
    private Long numberOfHighPriorityWarnings;
    @JsonProperty("numberOfLowPriorityWarnings")
    private Long numberOfLowPriorityWarnings;
    @JsonProperty("numberOfNewWarnings")
    private Long numberOfNewWarnings;
    @JsonProperty("numberOfNormalPriorityWarnings")
    private Long numberOfNormalPriorityWarnings;
    @JsonProperty("numberOfWarnings")
    private Long numberOfWarnings;
    @JsonProperty("pluginResult")
    private String pluginResult;
    @JsonProperty("referenceBuild")
    private ReferenceBuild referenceBuild;
    @JsonProperty("successfulHighScore")
    private Long successfulHighScore;
    @JsonProperty("successfulSinceBuild")
    private Long successfulSinceBuild;
    @JsonProperty("successfulSinceDate")
    private Long successfulSinceDate;
    @JsonProperty("warnings")
    private List<Warning> warnings = null;
    @JsonProperty("warningsDelta")
    private Long warningsDelta;
    @JsonProperty("zeroWarningsHighScore")
    private Long zeroWarningsHighScore;
    @JsonProperty("zeroWarningsSinceBuild")
    private Long zeroWarningsSinceBuild;
    @JsonProperty("zeroWarningsSinceDate")
    private Long zeroWarningsSinceDate;
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

    public Volaition withClass(String _class) {
        this._class = _class;
        return this;
    }

    @JsonProperty("modules")
    public List<String> getModules() {
        return modules;
    }

    @JsonProperty("modules")
    public void setModules(List<String> modules) {
        this.modules = modules;
    }

    public Volaition withModules(List<String> modules) {
        this.modules = modules;
        return this;
    }

    @JsonProperty("newSuccessfulHighScore")
    public Boolean getNewSuccessfulHighScore() {
        return newSuccessfulHighScore;
    }

    @JsonProperty("newSuccessfulHighScore")
    public void setNewSuccessfulHighScore(Boolean newSuccessfulHighScore) {
        this.newSuccessfulHighScore = newSuccessfulHighScore;
    }

    public Volaition withNewSuccessfulHighScore(Boolean newSuccessfulHighScore) {
        this.newSuccessfulHighScore = newSuccessfulHighScore;
        return this;
    }

    @JsonProperty("newWarnings")
    public List<NewWarning> getNewWarnings() {
        return newWarnings;
    }

    @JsonProperty("newWarnings")
    public void setNewWarnings(List<NewWarning> newWarnings) {
        this.newWarnings = newWarnings;
    }

    public Volaition withNewWarnings(List<NewWarning> newWarnings) {
        this.newWarnings = newWarnings;
        return this;
    }

    @JsonProperty("newZeroWarningsHighScore")
    public Boolean getNewZeroWarningsHighScore() {
        return newZeroWarningsHighScore;
    }

    @JsonProperty("newZeroWarningsHighScore")
    public void setNewZeroWarningsHighScore(Boolean newZeroWarningsHighScore) {
        this.newZeroWarningsHighScore = newZeroWarningsHighScore;
    }

    public Volaition withNewZeroWarningsHighScore(Boolean newZeroWarningsHighScore) {
        this.newZeroWarningsHighScore = newZeroWarningsHighScore;
        return this;
    }

    @JsonProperty("numberOfFixedWarnings")
    public Long getNumberOfFixedWarnings() {
        return numberOfFixedWarnings;
    }

    @JsonProperty("numberOfFixedWarnings")
    public void setNumberOfFixedWarnings(Long numberOfFixedWarnings) {
        this.numberOfFixedWarnings = numberOfFixedWarnings;
    }

    public Volaition withNumberOfFixedWarnings(Long numberOfFixedWarnings) {
        this.numberOfFixedWarnings = numberOfFixedWarnings;
        return this;
    }

    @JsonProperty("numberOfHighPriorityWarnings")
    public Long getNumberOfHighPriorityWarnings() {
        return numberOfHighPriorityWarnings;
    }

    @JsonProperty("numberOfHighPriorityWarnings")
    public void setNumberOfHighPriorityWarnings(Long numberOfHighPriorityWarnings) {
        this.numberOfHighPriorityWarnings = numberOfHighPriorityWarnings;
    }

    public Volaition withNumberOfHighPriorityWarnings(Long numberOfHighPriorityWarnings) {
        this.numberOfHighPriorityWarnings = numberOfHighPriorityWarnings;
        return this;
    }

    @JsonProperty("numberOfLowPriorityWarnings")
    public Long getNumberOfLowPriorityWarnings() {
        return numberOfLowPriorityWarnings;
    }

    @JsonProperty("numberOfLowPriorityWarnings")
    public void setNumberOfLowPriorityWarnings(Long numberOfLowPriorityWarnings) {
        this.numberOfLowPriorityWarnings = numberOfLowPriorityWarnings;
    }

    public Volaition withNumberOfLowPriorityWarnings(Long numberOfLowPriorityWarnings) {
        this.numberOfLowPriorityWarnings = numberOfLowPriorityWarnings;
        return this;
    }

    @JsonProperty("numberOfNewWarnings")
    public Long getNumberOfNewWarnings() {
        return numberOfNewWarnings;
    }

    @JsonProperty("numberOfNewWarnings")
    public void setNumberOfNewWarnings(Long numberOfNewWarnings) {
        this.numberOfNewWarnings = numberOfNewWarnings;
    }

    public Volaition withNumberOfNewWarnings(Long numberOfNewWarnings) {
        this.numberOfNewWarnings = numberOfNewWarnings;
        return this;
    }

    @JsonProperty("numberOfNormalPriorityWarnings")
    public Long getNumberOfNormalPriorityWarnings() {
        return numberOfNormalPriorityWarnings;
    }

    @JsonProperty("numberOfNormalPriorityWarnings")
    public void setNumberOfNormalPriorityWarnings(Long numberOfNormalPriorityWarnings) {
        this.numberOfNormalPriorityWarnings = numberOfNormalPriorityWarnings;
    }

    public Volaition withNumberOfNormalPriorityWarnings(Long numberOfNormalPriorityWarnings) {
        this.numberOfNormalPriorityWarnings = numberOfNormalPriorityWarnings;
        return this;
    }

    @JsonProperty("numberOfWarnings")
    public Long getNumberOfWarnings() {
        return numberOfWarnings;
    }

    @JsonProperty("numberOfWarnings")
    public void setNumberOfWarnings(Long numberOfWarnings) {
        this.numberOfWarnings = numberOfWarnings;
    }

    public Volaition withNumberOfWarnings(Long numberOfWarnings) {
        this.numberOfWarnings = numberOfWarnings;
        return this;
    }

    @JsonProperty("pluginResult")
    public String getPluginResult() {
        return pluginResult;
    }

    @JsonProperty("pluginResult")
    public void setPluginResult(String pluginResult) {
        this.pluginResult = pluginResult;
    }

    public Volaition withPluginResult(String pluginResult) {
        this.pluginResult = pluginResult;
        return this;
    }

    @JsonProperty("referenceBuild")
    public ReferenceBuild getReferenceBuild() {
        return referenceBuild;
    }

    @JsonProperty("referenceBuild")
    public void setReferenceBuild(ReferenceBuild referenceBuild) {
        this.referenceBuild = referenceBuild;
    }

    public Volaition withReferenceBuild(ReferenceBuild referenceBuild) {
        this.referenceBuild = referenceBuild;
        return this;
    }

    @JsonProperty("successfulHighScore")
    public Long getSuccessfulHighScore() {
        return successfulHighScore;
    }

    @JsonProperty("successfulHighScore")
    public void setSuccessfulHighScore(Long successfulHighScore) {
        this.successfulHighScore = successfulHighScore;
    }

    public Volaition withSuccessfulHighScore(Long successfulHighScore) {
        this.successfulHighScore = successfulHighScore;
        return this;
    }

    @JsonProperty("successfulSinceBuild")
    public Long getSuccessfulSinceBuild() {
        return successfulSinceBuild;
    }

    @JsonProperty("successfulSinceBuild")
    public void setSuccessfulSinceBuild(Long successfulSinceBuild) {
        this.successfulSinceBuild = successfulSinceBuild;
    }

    public Volaition withSuccessfulSinceBuild(Long successfulSinceBuild) {
        this.successfulSinceBuild = successfulSinceBuild;
        return this;
    }

    @JsonProperty("successfulSinceDate")
    public Long getSuccessfulSinceDate() {
        return successfulSinceDate;
    }

    @JsonProperty("successfulSinceDate")
    public void setSuccessfulSinceDate(Long successfulSinceDate) {
        this.successfulSinceDate = successfulSinceDate;
    }

    public Volaition withSuccessfulSinceDate(Long successfulSinceDate) {
        this.successfulSinceDate = successfulSinceDate;
        return this;
    }

    @JsonProperty("warnings")
    public List<Warning> getWarnings() {
        return warnings;
    }

    @JsonProperty("warnings")
    public void setWarnings(List<Warning> warnings) {
        this.warnings = warnings;
    }

    public Volaition withWarnings(List<Warning> warnings) {
        this.warnings = warnings;
        return this;
    }

    @JsonProperty("warningsDelta")
    public Long getWarningsDelta() {
        return warningsDelta;
    }

    @JsonProperty("warningsDelta")
    public void setWarningsDelta(Long warningsDelta) {
        this.warningsDelta = warningsDelta;
    }

    public Volaition withWarningsDelta(Long warningsDelta) {
        this.warningsDelta = warningsDelta;
        return this;
    }

    @JsonProperty("zeroWarningsHighScore")
    public Long getZeroWarningsHighScore() {
        return zeroWarningsHighScore;
    }

    @JsonProperty("zeroWarningsHighScore")
    public void setZeroWarningsHighScore(Long zeroWarningsHighScore) {
        this.zeroWarningsHighScore = zeroWarningsHighScore;
    }

    public Volaition withZeroWarningsHighScore(Long zeroWarningsHighScore) {
        this.zeroWarningsHighScore = zeroWarningsHighScore;
        return this;
    }

    @JsonProperty("zeroWarningsSinceBuild")
    public Long getZeroWarningsSinceBuild() {
        return zeroWarningsSinceBuild;
    }

    @JsonProperty("zeroWarningsSinceBuild")
    public void setZeroWarningsSinceBuild(Long zeroWarningsSinceBuild) {
        this.zeroWarningsSinceBuild = zeroWarningsSinceBuild;
    }

    public Volaition withZeroWarningsSinceBuild(Long zeroWarningsSinceBuild) {
        this.zeroWarningsSinceBuild = zeroWarningsSinceBuild;
        return this;
    }

    @JsonProperty("zeroWarningsSinceDate")
    public Long getZeroWarningsSinceDate() {
        return zeroWarningsSinceDate;
    }

    @JsonProperty("zeroWarningsSinceDate")
    public void setZeroWarningsSinceDate(Long zeroWarningsSinceDate) {
        this.zeroWarningsSinceDate = zeroWarningsSinceDate;
    }

    public Volaition withZeroWarningsSinceDate(Long zeroWarningsSinceDate) {
        this.zeroWarningsSinceDate = zeroWarningsSinceDate;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Volaition withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }


}
