package org.modelio.module.cpswarm.type.abstraction;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "class",
    "constants",
    "fields"
})
public class Msg {
    /**
     * 
     * (Required)
     */
    @JsonProperty("class")
    private String _class;

    @JsonProperty("constants")
    private List<Constant> constants = null;

    @JsonProperty("fields")
    private List<Field> fields = null;

    /**
     * No args constructor for use in serialization
     */
    public Msg() {
    }

    /**
     * @param _class
     */
    public Msg(String _class, List<Constant> constants, List<Field> fields) {
        super();
        this._class = _class;
        this.constants = constants;
        this.fields = fields;
    }

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

    @JsonProperty("constants")
    public List<Constant> getConstants() {
        return constants;
    }

    @JsonProperty("constants")
    public void setConstants(List<Constant> constants) {
        this.constants = constants;
    }

    @JsonProperty("fields")
    public List<Field> getFields() {
        return fields;
    }

    @JsonProperty("fields")
    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

}
