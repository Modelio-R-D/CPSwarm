package org.modelio.module.cpswarm.type.algorithm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "inputs",
    "outputs",
    "comm_paradigm"
})
public class Api {
    /**
     * 
     * (Required)
     */
    @JsonProperty("comm_paradigm")
    private org.modelio.module.cpswarm.type.algorithm.Api.CommParadigm commParadigm;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("inputs")
    private List<Input> inputs = null;

    @JsonProperty("outputs")
    private List<Output> outputs = null;

    @JsonProperty("inputs")
    public List<Input> getInputs() {
        return inputs;
    }

    @JsonProperty("inputs")
    public void setInputs(List<Input> inputs) {
        this.inputs = inputs;
    }

    @JsonProperty("outputs")
    public List<Output> getOutputs() {
        return outputs;
    }

    @JsonProperty("outputs")
    public void setOutputs(List<Output> outputs) {
        this.outputs = outputs;
    }

    /**
     * (Required)
     */
    @JsonProperty("comm_paradigm")
    public org.modelio.module.cpswarm.type.algorithm.Api.CommParadigm getCommParadigm() {
        return commParadigm;
    }

    /**
     * (Required)
     */
    @JsonProperty("comm_paradigm")
    public void setCommParadigm(org.modelio.module.cpswarm.type.algorithm.Api.CommParadigm commParadigm) {
        this.commParadigm = commParadigm;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public enum CommParadigm {
        ROSACTION ("rosaction"),
        ROSSERVICE ("rosservice");

        private final String value;

        private static final Map<String, org.modelio.module.cpswarm.type.algorithm.Api.CommParadigm> CONSTANTS = new HashMap<String, Api.CommParadigm>();

        private CommParadigm(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static org.modelio.module.cpswarm.type.algorithm.Api.CommParadigm fromValue(String value) {
            Api.CommParadigm constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }


static {
    for (Api.CommParadigm c: values()) {
        CONSTANTS.put(c.value, c);
    }
}
    }

}
