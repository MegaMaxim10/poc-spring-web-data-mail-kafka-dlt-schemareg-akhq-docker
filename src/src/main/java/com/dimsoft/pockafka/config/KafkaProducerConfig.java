package com.dimsoft.pockafka.config;

import java.util.HashMap;
import java.util.Map;

import com.dimsoft.pockafka.schemas.AvroMail;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import io.confluent.kafka.serializers.KafkaAvroSerializer;

@Configuration
public class KafkaProducerConfig {
    @Value("${com.dimsoft.pockafka.bootstrap-servers}")
    private String bootstrapServers;

	@Value("${registry.url}")
    private String registry;

	@Bean
	public ProducerFactory<String, AvroMail> mailProducerFactory() {
		Map<String, Object> configProps = new HashMap<>();
		configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class);
		configProps.put("schema.registry.url", registry);
		return new DefaultKafkaProducerFactory<>(configProps);
	}

	@Bean
	public KafkaTemplate<String, AvroMail> mailKafkaTemplate() {
		return new KafkaTemplate<>(mailProducerFactory());
	}
}
