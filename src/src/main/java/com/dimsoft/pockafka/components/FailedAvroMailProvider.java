package com.dimsoft.pockafka.components;

import java.util.function.Function;

import com.dimsoft.pockafka.schemas.AvroMail;

import org.springframework.kafka.support.serializer.FailedDeserializationInfo;

public class FailedAvroMailProvider implements Function<FailedDeserializationInfo, AvroMail> {
    @Override
    public AvroMail apply(FailedDeserializationInfo info) {
        return new BadAvroMail(info.getTopic(), info.getData(), info.getException());
    }
}
