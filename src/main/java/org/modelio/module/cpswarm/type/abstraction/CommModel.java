package org.modelio.module.cpswarm.type.abstraction;

import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "paradigm",
    "definition"
})
public class CommModel {
    /**
     *
     * (Required)
     */
    @JsonProperty("paradigm")
    private org.modelio.module.cpswarm.type.abstraction.CommModel.Paradigm paradigm;

    /**
     *
     * (Required)
     */
    @JsonProperty("definition")
    private Definition definition;

    /**
     * No args constructor for use in serialization
     */
    public CommModel() {
    }

    public CommModel(org.modelio.module.cpswarm.type.abstraction.CommModel.Paradigm paradigm, Definition definition) {
        super();
        this.paradigm = paradigm;
        this.definition = definition;
    }

    /**
     * (Required)
     */
    @JsonProperty("paradigm")
    public org.modelio.module.cpswarm.type.abstraction.CommModel.Paradigm getParadigm() {
        return paradigm;
    }

    /**
     * (Required)
     */
    @JsonProperty("paradigm")
    public void setParadigm(org.modelio.module.cpswarm.type.abstraction.CommModel.Paradigm paradigm) {
        this.paradigm = paradigm;
    }

    /**
     * (Required)
     */
    @JsonProperty("definition")
    public Definition getDefinition() {
        return definition;
    }

    /**
     * (Required)
     */
    @JsonProperty("definition")
    public void setDefinition(Definition definition) {
        this.definition = definition;
    }

    public enum Paradigm {
        ROSACTION ("rosaction"),
        ROSSERVICE ("rosservice");

        private final String value;

        private static final HashMap<String, org.modelio.module.cpswarm.type.abstraction.CommModel.Paradigm> CONSTANTS = new HashMap<String, CommModel.Paradigm>();

        private Paradigm(String value) {
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
        public static org.modelio.module.cpswarm.type.abstraction.CommModel.Paradigm fromValue(String value) {
            CommModel.Paradigm constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }


static {
    for (CommModel.Paradigm c: values()) {
        CONSTANTS.put(c.value, c);
    }
}
    }

}
