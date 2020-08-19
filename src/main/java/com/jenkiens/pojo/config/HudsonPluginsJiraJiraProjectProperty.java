
package com.jenkiens.pojo.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "plugin"
})
public class HudsonPluginsJiraJiraProjectProperty {

    @JsonProperty("plugin")
    private String plugin;

    @JsonProperty("plugin")
    public String getPlugin() {
        return plugin;
    }

    @JsonProperty("plugin")
    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

}
