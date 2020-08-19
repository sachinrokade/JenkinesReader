
package com.jenkiens.pojo.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hudson.plugins.emailext.ExtendedEmailPublisher"
})
public class Publishers {

    @JsonProperty("hudson.plugins.emailext.ExtendedEmailPublisher")
    private HudsonPluginsEmailextExtendedEmailPublisher hudsonPluginsEmailextExtendedEmailPublisher;

    @JsonProperty("hudson.plugins.emailext.ExtendedEmailPublisher")
    public HudsonPluginsEmailextExtendedEmailPublisher getHudsonPluginsEmailextExtendedEmailPublisher() {
        return hudsonPluginsEmailextExtendedEmailPublisher;
    }

    @JsonProperty("hudson.plugins.emailext.ExtendedEmailPublisher")
    public void setHudsonPluginsEmailextExtendedEmailPublisher(HudsonPluginsEmailextExtendedEmailPublisher hudsonPluginsEmailextExtendedEmailPublisher) {
        this.hudsonPluginsEmailextExtendedEmailPublisher = hudsonPluginsEmailextExtendedEmailPublisher;
    }

}
