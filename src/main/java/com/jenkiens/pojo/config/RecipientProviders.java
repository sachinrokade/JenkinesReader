
package com.jenkiens.pojo.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hudson.plugins.emailext.plugins.recipients.ListRecipientProvider"
})
public class RecipientProviders {

    @JsonProperty("hudson.plugins.emailext.plugins.recipients.ListRecipientProvider")
    private Object hudsonPluginsEmailextPluginsRecipientsListRecipientProvider;

    @JsonProperty("hudson.plugins.emailext.plugins.recipients.ListRecipientProvider")
    public Object getHudsonPluginsEmailextPluginsRecipientsListRecipientProvider() {
        return hudsonPluginsEmailextPluginsRecipientsListRecipientProvider;
    }

    @JsonProperty("hudson.plugins.emailext.plugins.recipients.ListRecipientProvider")
    public void setHudsonPluginsEmailextPluginsRecipientsListRecipientProvider(Object hudsonPluginsEmailextPluginsRecipientsListRecipientProvider) {
        this.hudsonPluginsEmailextPluginsRecipientsListRecipientProvider = hudsonPluginsEmailextPluginsRecipientsListRecipientProvider;
    }

}
