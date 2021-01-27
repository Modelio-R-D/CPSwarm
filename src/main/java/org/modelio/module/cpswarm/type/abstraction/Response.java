package org.modelio.module.cpswarm.type.abstraction;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "constants",
    "fields"
})
public class Response {
    @JsonProperty("constants")
    private List<Constant> constants = null;

    /**
     * 
     * (Required)
     */
    @JsonProperty("fields")
    private List<Field> fields = null;

    @JsonProperty("constants")
    public List<Constant> getConstants() {
        return constants;
    }

    @JsonProperty("constants")
    public void setConstants(List<Constant> constants) {
        this.constants = constants;
    }

    /**
     * (Required)
     */
    @JsonProperty("fields")
    public List<Field> getFields() {
        return fields;
    }

    /**
     * (Required)
     */
    @JsonProperty("fields")
    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    /**
     * No args constructor for use in serialization
     */
    public Response() {
    }

    public Response(List<Constant> constants, List<Field> fields) {
        super();
        this.constants = constants;
        this.fields = fields;
    }

}
