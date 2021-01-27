package org.modelio.module.cpswarm.type.abstraction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "name",
    "description",
    "category",
    "param_list",
    "api"
})
public class SensorsActuator {
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
    @JsonProperty("description")
    private String description;

    /**
     *
     * (Required)
     */
    @JsonProperty("category")
    private org.modelio.module.cpswarm.type.abstraction.SensorsActuator.Category category;

    /**
     *
     * (Required)
     */
    @JsonProperty("api")
    private Api api;

    @JsonProperty("param_list")
    private List<ParamList> paramList = null;

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
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * (Required)
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * (Required)
     */
    @JsonProperty("category")
    public org.modelio.module.cpswarm.type.abstraction.SensorsActuator.Category getCategory() {
        return category;
    }

    /**
     * (Required)
     */
    @JsonProperty("category")
    public void setCategory(org.modelio.module.cpswarm.type.abstraction.SensorsActuator.Category category) {
        this.category = category;
    }

    /**
     * (Required)
     */
    @JsonProperty("api")
    public Api getApi() {
        return api;
    }

    /**
     * (Required)
     */
    @JsonProperty("api")
    public void setApi(Api api) {
        this.api = api;
    }

    /**
     * No args constructor for use in serialization
     */
    public SensorsActuator() {
    }

    public SensorsActuator(String name, String description, org.modelio.module.cpswarm.type.abstraction.SensorsActuator.Category category, List<ParamList> paramList, Api api) {
        super();
        this.name = name;
        this.description = description;
        this.category = category;
        this.paramList = paramList;
        this.api = api;
    }

    @JsonProperty("param_list")
    public List<ParamList> getParamList() {
        return paramList;
    }

    @JsonProperty("param_list")
    public void setParamList(List<ParamList> paramList) {
        this.paramList = paramList;
    }

    public enum Category {
        SENSOR ("Sensor"),
        ACTUATOR ("Actuator"),
        VIRTUAL ("Virtual");

        private final String value;

        private static final Map<String, org.modelio.module.cpswarm.type.abstraction.SensorsActuator.Category> CONSTANTS = new HashMap<String, SensorsActuator.Category>();

        private Category(String value) {
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
        public static org.modelio.module.cpswarm.type.abstraction.SensorsActuator.Category fromValue(String value) {
            SensorsActuator.Category constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }


        static {
            for (SensorsActuator.Category c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }
    }

}
