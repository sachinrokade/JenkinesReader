
package com.jenkiens.pojo.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "plugin",
    "recipientList",
    "configuredTriggers",
    "contentType",
    "defaultSubject",
    "defaultContent",
    "attachmentsPattern",
    "presendScript",
    "postsendScript",
    "attachBuildLog",
    "compressBuildLog",
    "replyTo",
    "from",
    "saveOutput",
    "disabled"
})
public class HudsonPluginsEmailextExtendedEmailPublisher {

    @JsonProperty("plugin")
    private String plugin;
    @JsonProperty("recipientList")
    private String recipientList;
    @JsonProperty("configuredTriggers")
    private ConfiguredTriggers configuredTriggers;
    @JsonProperty("contentType")
    private String contentType;
    @JsonProperty("defaultSubject")
    private String defaultSubject;
    @JsonProperty("defaultContent")
    private String defaultContent;
    @JsonProperty("attachmentsPattern")
    private Object attachmentsPattern;
    @JsonProperty("presendScript")
    private String presendScript;
    @JsonProperty("postsendScript")
    private String postsendScript;
    @JsonProperty("attachBuildLog")
    private String attachBuildLog;
    @JsonProperty("compressBuildLog")
    private String compressBuildLog;
    @JsonProperty("replyTo")
    private String replyTo;
    @JsonProperty("from")
    private Object from;
    @JsonProperty("saveOutput")
    private String saveOutput;
    @JsonProperty("disabled")
    private String disabled;

    @JsonProperty("plugin")
    public String getPlugin() {
        return plugin;
    }

    @JsonProperty("plugin")
    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    @JsonProperty("recipientList")
    public String getRecipientList() {
        return recipientList;
    }

    @JsonProperty("recipientList")
    public void setRecipientList(String recipientList) {
        this.recipientList = recipientList;
    }

    @JsonProperty("configuredTriggers")
    public ConfiguredTriggers getConfiguredTriggers() {
        return configuredTriggers;
    }

    @JsonProperty("configuredTriggers")
    public void setConfiguredTriggers(ConfiguredTriggers configuredTriggers) {
        this.configuredTriggers = configuredTriggers;
    }

    @JsonProperty("contentType")
    public String getContentType() {
        return contentType;
    }

    @JsonProperty("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @JsonProperty("defaultSubject")
    public String getDefaultSubject() {
        return defaultSubject;
    }

    @JsonProperty("defaultSubject")
    public void setDefaultSubject(String defaultSubject) {
        this.defaultSubject = defaultSubject;
    }

    @JsonProperty("defaultContent")
    public String getDefaultContent() {
        return defaultContent;
    }

    @JsonProperty("defaultContent")
    public void setDefaultContent(String defaultContent) {
        this.defaultContent = defaultContent;
    }

    @JsonProperty("attachmentsPattern")
    public Object getAttachmentsPattern() {
        return attachmentsPattern;
    }

    @JsonProperty("attachmentsPattern")
    public void setAttachmentsPattern(Object attachmentsPattern) {
        this.attachmentsPattern = attachmentsPattern;
    }

    @JsonProperty("presendScript")
    public String getPresendScript() {
        return presendScript;
    }

    @JsonProperty("presendScript")
    public void setPresendScript(String presendScript) {
        this.presendScript = presendScript;
    }

    @JsonProperty("postsendScript")
    public String getPostsendScript() {
        return postsendScript;
    }

    @JsonProperty("postsendScript")
    public void setPostsendScript(String postsendScript) {
        this.postsendScript = postsendScript;
    }

    @JsonProperty("attachBuildLog")
    public String getAttachBuildLog() {
        return attachBuildLog;
    }

    @JsonProperty("attachBuildLog")
    public void setAttachBuildLog(String attachBuildLog) {
        this.attachBuildLog = attachBuildLog;
    }

    @JsonProperty("compressBuildLog")
    public String getCompressBuildLog() {
        return compressBuildLog;
    }

    @JsonProperty("compressBuildLog")
    public void setCompressBuildLog(String compressBuildLog) {
        this.compressBuildLog = compressBuildLog;
    }

    @JsonProperty("replyTo")
    public String getReplyTo() {
        return replyTo;
    }

    @JsonProperty("replyTo")
    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    @JsonProperty("from")
    public Object getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(Object from) {
        this.from = from;
    }

    @JsonProperty("saveOutput")
    public String getSaveOutput() {
        return saveOutput;
    }

    @JsonProperty("saveOutput")
    public void setSaveOutput(String saveOutput) {
        this.saveOutput = saveOutput;
    }

    @JsonProperty("disabled")
    public String getDisabled() {
        return disabled;
    }

    @JsonProperty("disabled")
    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

}
