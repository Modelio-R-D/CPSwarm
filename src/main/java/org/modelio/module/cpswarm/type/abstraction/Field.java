package org.modelio.module.cpswarm.type.abstraction;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "class",
    "name",
    "description"
})
public class Field {
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
    public Field() {
    }

    /**
     * @param _class
     */
    public Field(String _class, String name, String description) {
        super();
        this._class = _class;
        this.name = name;
        this.description = description;
    }

}
