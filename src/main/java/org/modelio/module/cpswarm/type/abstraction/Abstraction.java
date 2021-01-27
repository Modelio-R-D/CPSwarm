package org.modelio.module.cpswarm.type.abstraction;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "runtime-env",
    "sensors/actuators",
    "functions"
})
public class Abstraction {
    /**
     * 
     * (Required)
     */
    @JsonProperty("runtime-env")
    private Object runtimeEnv;

    @JsonProperty("sensors/actuators")
    private List<SensorsActuator> sensorsActuators = null;

    @JsonProperty("functions")
    private List<Function> functions = null;

    /**
     * (Required)
     */
    @JsonProperty("runtime-env")
    public Object getRuntimeEnv() {
        return this.runtimeEnv;
    }

    /**
     * (Required)
     */
    @JsonProperty("runtime-env")
    public void setRuntimeEnv(Object runtimeEnv) {
        this.runtimeEnv = runtimeEnv;
    }

    @JsonProperty("sensors/actuators")
    public List<SensorsActuator> getSensorsActuators() {
        return this.sensorsActuators;
    }

    @JsonProperty("sensors/actuators")
    public void setSensorsActuators(List<SensorsActuator> sensorsActuators) {
        this.sensorsActuators = sensorsActuators;
    }

    @JsonProperty("functions")
    public List<Function> getFunctions() {
        return this.functions;
    }

    @JsonProperty("functions")
    public void setFunctions(List<Function> functions) {
        this.functions = functions;
    }

    /**
     * No args constructor for use in serialization
     */
    public Abstraction() {
    }

    public Abstraction(Object runtimeEnv, List<SensorsActuator> sensorsActuators, List<Function> functions) {
        super();
        this.runtimeEnv = runtimeEnv;
        this.sensorsActuators = sensorsActuators;
        this.functions = functions;
    }

}
