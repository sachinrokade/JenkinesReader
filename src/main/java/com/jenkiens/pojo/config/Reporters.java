
package com.jenkiens.pojo.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hudson.plugins.checkstyle.CheckStyleReporter",
    "hudson.plugins.pmd.PmdReporter"
})
public class Reporters {

    @JsonProperty("hudson.plugins.checkstyle.CheckStyleReporter")
    private HudsonPluginsCheckstyleCheckStyleReporter hudsonPluginsCheckstyleCheckStyleReporter;
    @JsonProperty("hudson.plugins.pmd.PmdReporter")
    private HudsonPluginsPmdPmdReporter hudsonPluginsPmdPmdReporter;

    @JsonProperty("hudson.plugins.checkstyle.CheckStyleReporter")
    public HudsonPluginsCheckstyleCheckStyleReporter getHudsonPluginsCheckstyleCheckStyleReporter() {
        return hudsonPluginsCheckstyleCheckStyleReporter;
    }

    @JsonProperty("hudson.plugins.checkstyle.CheckStyleReporter")
    public void setHudsonPluginsCheckstyleCheckStyleReporter(HudsonPluginsCheckstyleCheckStyleReporter hudsonPluginsCheckstyleCheckStyleReporter) {
        this.hudsonPluginsCheckstyleCheckStyleReporter = hudsonPluginsCheckstyleCheckStyleReporter;
    }

    @JsonProperty("hudson.plugins.pmd.PmdReporter")
    public HudsonPluginsPmdPmdReporter getHudsonPluginsPmdPmdReporter() {
        return hudsonPluginsPmdPmdReporter;
    }

    @JsonProperty("hudson.plugins.pmd.PmdReporter")
    public void setHudsonPluginsPmdPmdReporter(HudsonPluginsPmdPmdReporter hudsonPluginsPmdPmdReporter) {
        this.hudsonPluginsPmdPmdReporter = hudsonPluginsPmdPmdReporter;
    }

}
