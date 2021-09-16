package com.dimsoft.pockafka.components;

import com.dimsoft.pockafka.schemas.AvroMail;

import org.springframework.kafka.support.serializer.FailedDeserializationInfo;

public class BadAvroMail extends AvroMail {
    private final FailedDeserializationInfo failedDeserializationInfo;

    public BadAvroMail(FailedDeserializationInfo failedDeserializationInfo) {
        this.failedDeserializationInfo = failedDeserializationInfo;
    }

    public FailedDeserializationInfo getFailedDeserializationInfo() {
        return this.failedDeserializationInfo;
    }
}
