
package com.jenkiens.pojo.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hudson.plugins.jira.JiraProjectProperty"
})
public class Properties {

    @JsonProperty("hudson.plugins.jira.JiraProjectProperty")
    private HudsonPluginsJiraJiraProjectProperty hudsonPluginsJiraJiraProjectProperty;

    @JsonProperty("hudson.plugins.jira.JiraProjectProperty")
    public HudsonPluginsJiraJiraProjectProperty getHudsonPluginsJiraJiraProjectProperty() {
        return hudsonPluginsJiraJiraProjectProperty;
    }

    @JsonProperty("hudson.plugins.jira.JiraProjectProperty")
    public void setHudsonPluginsJiraJiraProjectProperty(HudsonPluginsJiraJiraProjectProperty hudsonPluginsJiraJiraProjectProperty) {
        this.hudsonPluginsJiraJiraProjectProperty = hudsonPluginsJiraJiraProjectProperty;
    }

}
