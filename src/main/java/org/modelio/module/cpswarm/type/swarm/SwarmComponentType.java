package org.modelio.module.cpswarm.type.swarm;


public enum SwarmComponentType {
    SENSOR ("Sensor"),
    ACTUATOR ("Actuator"),
    VIRTUAL ("Virtual"),
    CONTROLLER ("Controller");

    private final String value;

    private SwarmComponentType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String getValue() {
        return this.value;
    }

    public String getCorrespondingStereotype() {
        return this.value;
    }

    public static SwarmComponentType getSwarmComponentType(String value) {
        switch(value) {
        case "Sensor":
            return SwarmComponentType.SENSOR;
        case "Actuator":
            return SwarmComponentType.ACTUATOR;
        case "Virtual":
            return SwarmComponentType.VIRTUAL;
        case "Controller":
            return SwarmComponentType.CONTROLLER;
        default:
            return null;
        }
    }

}
