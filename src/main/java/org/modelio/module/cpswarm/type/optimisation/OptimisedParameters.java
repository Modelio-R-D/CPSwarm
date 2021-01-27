package org.modelio.module.cpswarm.type.optimisation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "parameters"
})
public class OptimisedParameters {
    /**
     * 
     * (Required)
     */
    @JsonProperty("parameters")
    private List<Parameter> parameters = null;

    /**
     * (Required)
     */
    @JsonProperty("parameters")
    public List<Parameter> getParameters() {
        return this.parameters;
    }

    /**
     * (Required)
     */
    @JsonProperty("parameters")
    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

}
