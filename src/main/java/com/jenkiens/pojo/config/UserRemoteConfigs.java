
package com.jenkiens.pojo.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hudson.plugins.git.UserRemoteConfig"
})
public class UserRemoteConfigs {

    @JsonProperty("hudson.plugins.git.UserRemoteConfig")
    private HudsonPluginsGitUserRemoteConfig hudsonPluginsGitUserRemoteConfig;

    @JsonProperty("hudson.plugins.git.UserRemoteConfig")
    public HudsonPluginsGitUserRemoteConfig getHudsonPluginsGitUserRemoteConfig() {
        return hudsonPluginsGitUserRemoteConfig;
    }

    @JsonProperty("hudson.plugins.git.UserRemoteConfig")
    public void setHudsonPluginsGitUserRemoteConfig(HudsonPluginsGitUserRemoteConfig hudsonPluginsGitUserRemoteConfig) {
        this.hudsonPluginsGitUserRemoteConfig = hudsonPluginsGitUserRemoteConfig;
    }

}
