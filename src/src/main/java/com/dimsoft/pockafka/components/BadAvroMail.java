package com.dimsoft.pockafka.components;

import com.dimsoft.pockafka.schemas.AvroMail;

public class BadAvroMail extends AvroMail {
    private String topic;
    private byte[] data;
    private Exception exception;

    public BadAvroMail(String topic, byte[] data, Exception exception) {
        this.topic = topic;
        this.data = data;
        this.exception = exception;
    }
    
    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }
    public byte[] getData() {
        return data;
    }
    public void setData(byte[] data) {
        this.data = data;
    }
    public Exception getException() {
        return exception;
    }
    public void setException(Exception exception) {
        this.exception = exception;
    }
    
}
