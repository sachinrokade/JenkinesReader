
package com.jenkiens.pojo.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hudson.plugins.git.BranchSpec"
})
public class Branches {

    @JsonProperty("hudson.plugins.git.BranchSpec")
    private HudsonPluginsGitBranchSpec hudsonPluginsGitBranchSpec;

    @JsonProperty("hudson.plugins.git.BranchSpec")
    public HudsonPluginsGitBranchSpec getHudsonPluginsGitBranchSpec() {
        return hudsonPluginsGitBranchSpec;
    }

    @JsonProperty("hudson.plugins.git.BranchSpec")
    public void setHudsonPluginsGitBranchSpec(HudsonPluginsGitBranchSpec hudsonPluginsGitBranchSpec) {
        this.hudsonPluginsGitBranchSpec = hudsonPluginsGitBranchSpec;
    }

}
