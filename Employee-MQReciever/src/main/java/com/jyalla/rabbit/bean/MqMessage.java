package com.jyalla.rabbit.bean;

import java.util.Date;
import com.jyalla.rabbit.bean.User;

public class MqMessage {
    private String id;
    private User body;
    private Date timestamp;

    public MqMessage(String id, User body, Date timestamp) {
        super();
        this.id = id;
        this.body = body;
        this.timestamp = timestamp;
    }

    public MqMessage() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String string) {
        this.id = string;
    }

    public User getbody() {
        return body;
    }

    public void setbody(User body) {
        this.body = body;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "MqMessage [id=" + id + ", body=" + body + ", timestamp=" + timestamp + "]";
    }


}
