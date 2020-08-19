
package com.jenkiens.pojo.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConfiguredTriggers {

    @JsonProperty("hudson.plugins.emailext.plugins.trigger.FailureTrigger")
    private HudsonPluginsEmailextPluginsTriggerFailureTrigger hudsonPluginsEmailextPluginsTriggerFailureTrigger;

    @JsonProperty("hudson.plugins.emailext.plugins.trigger.FailureTrigger")
    public HudsonPluginsEmailextPluginsTriggerFailureTrigger getHudsonPluginsEmailextPluginsTriggerFailureTrigger() {
        return hudsonPluginsEmailextPluginsTriggerFailureTrigger;
    }

    @JsonProperty("hudson.plugins.emailext.plugins.trigger.FailureTrigger")
    public void setHudsonPluginsEmailextPluginsTriggerFailureTrigger(HudsonPluginsEmailextPluginsTriggerFailureTrigger hudsonPluginsEmailextPluginsTriggerFailureTrigger) {
        this.hudsonPluginsEmailextPluginsTriggerFailureTrigger = hudsonPluginsEmailextPluginsTriggerFailureTrigger;
    }

}
