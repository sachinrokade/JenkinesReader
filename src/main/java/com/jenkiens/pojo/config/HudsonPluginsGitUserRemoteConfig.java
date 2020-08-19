
package com.jenkiens.pojo.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "url",
    "credentialsId"
})
public class HudsonPluginsGitUserRemoteConfig {

    @JsonProperty("url")
    private String url;
    @JsonProperty("credentialsId")
    private String credentialsId;

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("credentialsId")
    public String getCredentialsId() {
        return credentialsId;
    }

    @JsonProperty("credentialsId")
    public void setCredentialsId(String credentialsId) {
        this.credentialsId = credentialsId;
    }

}
