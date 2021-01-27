package org.modelio.module.cpswarm.type.abstraction;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "class",
    "name",
    "value",
    "description"
})
public class Constant {
    /**
     * 
     * (Required)
     */
    @JsonProperty("class")
    private String _class;

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
    @JsonProperty("value")
    private Double value;

    @JsonProperty("description")
    private String description;

    /**
     * (Required)
     */
    @JsonProperty("class")
    public String getClass_() {
        return _class;
    }

    /**
     * (Required)
     */
    @JsonProperty("class")
    public void setClass_(String _class) {
        this._class = _class;
    }

    /**
     * (Required)
     */
    @JsonProperty("name")
    public String getName() {
        return name;
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
    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    /**
     * (Required)
     */
    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * No args constructor for use in serialization
     */
    public Constant() {
    }

    /**
     * @param _class
     */
    public Constant(String _class, String name, Double value, String description) {
        super();
        this._class = _class;
        this.name = name;
        this.value = value;
        this.description = description;
    }

}
