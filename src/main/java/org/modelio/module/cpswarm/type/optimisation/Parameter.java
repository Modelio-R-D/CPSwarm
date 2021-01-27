package org.modelio.module.cpswarm.type.optimisation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "meta",
    "min",
    "max",
    "scale"
})
public class Parameter {
    /**
     * 
     * (Required)
     */
    @JsonProperty("name")
    private String name;

    /**
     * 
     * (Required)
     */
    @JsonProperty("meta")
    private String meta;

    /**
     * 
     * (Required)
     */
    @JsonProperty("scale")
    private String scale;

    /**
     * 
     * (Required)
     */
    @JsonProperty("min")
    private Object min;

    /**
     * 
     * (Required)
     */
    @JsonProperty("max")
    private Object max;

    /**
     * (Required)
     */
    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    /**
     * (Required)
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * (Required)
     */
    @JsonProperty("meta")
    public String getMeta() {
        return this.meta;
    }

    /**
     * (Required)
     */
    @JsonProperty("meta")
    public void setMeta(String meta) {
        this.meta = meta;
    }

    /**
     * (Required)
     */
    @JsonProperty("min")
    public Object getMin() {
        return this.min;
    }

    /**
     * (Required)
     */
    @JsonProperty("min")
    public void setMin(Object min) {
        this.min = min;
    }

    /**
     * (Required)
     */
    @JsonProperty("max")
    public Object getMax() {
        return this.max;
    }

    /**
     * (Required)
     */
    @JsonProperty("max")
    public void setMax(Object max) {
        this.max = max;
    }

    /**
     * (Required)
     */
    @JsonProperty("scale")
    public String getScale() {
        return this.scale;
    }

    /**
     * (Required)
     */
    @JsonProperty("scale")
    public void setScale(String scale) {
        this.scale = scale;
    }

}
