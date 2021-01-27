package org.modelio.module.cpswarm.type.abstraction;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "topic",
    "msg"
})
public class Output {
    /**
     * 
     * (Required)
     */
    @JsonProperty("topic")
    private String topic;

    /**
     * 
     * (Required)
     */
    @JsonProperty("msg")
    private Msg msg;

    /**
     * (Required)
     */
    @JsonProperty("topic")
    public String getTopic() {
        return topic;
    }

    /**
     * (Required)
     */
    @JsonProperty("topic")
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * No args constructor for use in serialization
     */
    public Output() {
    }

    public Output(String topic, Msg msg) {
        super();
        this.topic = topic;
        this.msg = msg;
    }

    /**
     * (Required)
     */
    @JsonProperty("msg")
    public Msg getMsg() {
        return msg;
    }

    /**
     * (Required)
     */
    @JsonProperty("msg")
    public void setMsg(Msg msg) {
        this.msg = msg;
    }

}
