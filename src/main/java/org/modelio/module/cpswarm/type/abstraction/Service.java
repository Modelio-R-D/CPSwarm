package org.modelio.module.cpswarm.type.abstraction;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "name",
    "class",
    "request",
    "response"
})
public class Service {
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
    @JsonProperty("class")
    private String _class;

    @JsonProperty("request")
    private Request request;

    @JsonProperty("response")
    private Response response;

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

    @JsonProperty("request")
    public Request getRequest() {
        return request;
    }

    @JsonProperty("request")
    public void setRequest(Request request) {
        this.request = request;
    }

    @JsonProperty("response")
    public Response getResponse() {
        return response;
    }

    @JsonProperty("response")
    public void setResponse(Response response) {
        this.response = response;
    }

    /**
     * No args constructor for use in serialization
     */
    public Service() {
    }

    /**
     * @param _class
     */
    public Service(String name, String _class, Request request, Response response) {
        super();
        this.name = name;
        this._class = _class;
        this.request = request;
        this.response = response;
    }

}
