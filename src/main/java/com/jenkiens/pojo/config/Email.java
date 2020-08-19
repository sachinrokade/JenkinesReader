
package com.jenkiens.pojo.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "subject",
    "body",
    "recipientProviders",
    "attachmentsPattern",
    "attachBuildLog",
    "compressBuildLog",
    "replyTo",
    "contentType"
})
public class Email {

    @JsonProperty("subject")
    private String subject;
    @JsonProperty("body")
    private String body;
    @JsonProperty("recipientProviders")
    private RecipientProviders recipientProviders;
    @JsonProperty("attachmentsPattern")
    private Object attachmentsPattern;
    @JsonProperty("attachBuildLog")
    private String attachBuildLog;
    @JsonProperty("compressBuildLog")
    private String compressBuildLog;
    @JsonProperty("replyTo")
    private String replyTo;
    @JsonProperty("contentType")
    private String contentType;

    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonProperty("recipientProviders")
    public RecipientProviders getRecipientProviders() {
        return recipientProviders;
    }

    @JsonProperty("recipientProviders")
    public void setRecipientProviders(RecipientProviders recipientProviders) {
        this.recipientProviders = recipientProviders;
    }

    @JsonProperty("attachmentsPattern")
    public Object getAttachmentsPattern() {
        return attachmentsPattern;
    }

    @JsonProperty("attachmentsPattern")
    public void setAttachmentsPattern(Object attachmentsPattern) {
        this.attachmentsPattern = attachmentsPattern;
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

    @JsonProperty("contentType")
    public String getContentType() {
        return contentType;
    }

    @JsonProperty("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

}
