package org.modelio.module.cpswarm.type.abstraction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Function {
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
    private org.modelio.module.cpswarm.type.abstraction.Function.Category category;

    /**
     * 
     * (Required)
     */
    @JsonProperty("api")
    private Api api;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    /**
     * No args constructor for use in serialization
     */
    public Function() {
    }

    public Function(String name, String description, org.modelio.module.cpswarm.type.abstraction.Function.Category category, List<ParamList> paramList, Api api) {
        super();
        this.name = name;
        this.description = description;
        this.category = category;
        this.paramList = paramList;
        this.api = api;
    }

    /**
     * (Required)
     */
    @JsonProperty("category")
    public org.modelio.module.cpswarm.type.abstraction.Function.Category getCategory() {
        return category;
    }

    /**
     * (Required)
     */
    @JsonProperty("category")
    public void setCategory(org.modelio.module.cpswarm.type.abstraction.Function.Category category) {
        this.category = category;
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
        ABSTRACTION_LIB ("abstraction-lib"),
        SWARM_LIB ("swarm-lib");

        private final String value;

        private static final Map<String, org.modelio.module.cpswarm.type.abstraction.Function.Category> CONSTANTS = new HashMap<String, Function.Category>();

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
        public static org.modelio.module.cpswarm.type.abstraction.Function.Category fromValue(String value) {
            Function.Category constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }


static {
    for (Function.Category c: values()) {
        CONSTANTS.put(c.value, c);
    }
}
    }

}
