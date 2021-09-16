package com.dimsoft.pockafka.config;

import com.dimsoft.pockafka.utils.Topics;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
class KafkaTopicConfig {
	@Bean
	NewTopic topicMail() {
		return TopicBuilder.name(Topics.MAIL_TOPIC).build();
	}

	@Bean
	NewTopic topicMailDLT() {
		return TopicBuilder.name(Topics.MAIL_TOPIC_DLT).build();
	}
}
