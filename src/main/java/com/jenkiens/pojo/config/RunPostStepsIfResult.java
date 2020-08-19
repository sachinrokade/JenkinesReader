
package com.jenkiens.pojo.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "ordinal",
    "color",
    "completeBuild"
})
public class RunPostStepsIfResult {

    @JsonProperty("name")
    private String name;
    @JsonProperty("ordinal")
    private String ordinal;
    @JsonProperty("color")
    private String color;
    @JsonProperty("completeBuild")
    private String completeBuild;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("ordinal")
    public String getOrdinal() {
        return ordinal;
    }

    @JsonProperty("ordinal")
    public void setOrdinal(String ordinal) {
        this.ordinal = ordinal;
    }

    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    @JsonProperty("completeBuild")
    public String getCompleteBuild() {
        return completeBuild;
    }

    @JsonProperty("completeBuild")
    public void setCompleteBuild(String completeBuild) {
        this.completeBuild = completeBuild;
    }

}
