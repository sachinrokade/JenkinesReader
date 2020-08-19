
package com.jenkiens.pojo.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "class",
    "plugin",
    "configVersion",
    "userRemoteConfigs",
    "branches",
    "doGenerateSubmoduleConfigurations",
    "submoduleCfg",
    "extensions"
})
public class Scm {

    @JsonProperty("class")
    private String _class;
    @JsonProperty("plugin")
    private String plugin;
    @JsonProperty("configVersion")
    private String configVersion;
    @JsonProperty("userRemoteConfigs")
    private UserRemoteConfigs userRemoteConfigs;
    @JsonProperty("branches")
    private Branches branches;
    @JsonProperty("doGenerateSubmoduleConfigurations")
    private String doGenerateSubmoduleConfigurations;
    @JsonProperty("submoduleCfg")
    private SubmoduleCfg submoduleCfg;
    @JsonProperty("extensions")
    private Object extensions;

    @JsonProperty("class")
    public String getClass_() {
        return _class;
    }

    @JsonProperty("class")
    public void setClass_(String _class) {
        this._class = _class;
    }

    @JsonProperty("plugin")
    public String getPlugin() {
        return plugin;
    }

    @JsonProperty("plugin")
    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    @JsonProperty("configVersion")
    public String getConfigVersion() {
        return configVersion;
    }

    @JsonProperty("configVersion")
    public void setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
    }

    @JsonProperty("userRemoteConfigs")
    public UserRemoteConfigs getUserRemoteConfigs() {
        return userRemoteConfigs;
    }

    @JsonProperty("userRemoteConfigs")
    public void setUserRemoteConfigs(UserRemoteConfigs userRemoteConfigs) {
        this.userRemoteConfigs = userRemoteConfigs;
    }

    @JsonProperty("branches")
    public Branches getBranches() {
        return branches;
    }

    @JsonProperty("branches")
    public void setBranches(Branches branches) {
        this.branches = branches;
    }

    @JsonProperty("doGenerateSubmoduleConfigurations")
    public String getDoGenerateSubmoduleConfigurations() {
        return doGenerateSubmoduleConfigurations;
    }

    @JsonProperty("doGenerateSubmoduleConfigurations")
    public void setDoGenerateSubmoduleConfigurations(String doGenerateSubmoduleConfigurations) {
        this.doGenerateSubmoduleConfigurations = doGenerateSubmoduleConfigurations;
    }

    @JsonProperty("submoduleCfg")
    public SubmoduleCfg getSubmoduleCfg() {
        return submoduleCfg;
    }

    @JsonProperty("submoduleCfg")
    public void setSubmoduleCfg(SubmoduleCfg submoduleCfg) {
        this.submoduleCfg = submoduleCfg;
    }

    @JsonProperty("extensions")
    public Object getExtensions() {
        return extensions;
    }

    @JsonProperty("extensions")
    public void setExtensions(Object extensions) {
        this.extensions = extensions;
    }

}
