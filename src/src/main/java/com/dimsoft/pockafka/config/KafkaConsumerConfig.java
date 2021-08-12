package com.dimsoft.pockafka.config;

import java.util.HashMap;
import java.util.Map;

import com.dimsoft.pockafka.schemas.AvroMail;
import com.dimsoft.pockafka.utils.Topics;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import io.confluent.kafka.serializers.KafkaAvroDeserializer;

@Configuration
@EnableKafka
public class KafkaConsumerConfig {
    @Value("${com.dimsoft.pockafka.bootstrap-servers}")
    private String bootstrapServers;

    @Value("${registry.url}")
    private String registry;

    public ConsumerFactory<String, AvroMail> mailConsumerFactory() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, Topics.MAIL_GROUP);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class);
        props.put("schema.registry.url", registry);
        return new DefaultKafkaConsumerFactory<>(props);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, AvroMail> mailKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, AvroMail> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(mailConsumerFactory());
        return factory;
    }
}
