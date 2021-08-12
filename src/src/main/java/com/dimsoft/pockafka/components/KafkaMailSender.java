package com.dimsoft.pockafka.components;

import com.dimsoft.pockafka.beans.Mail;
import com.dimsoft.pockafka.schemas.AvroMail;
import com.dimsoft.pockafka.utils.Mapper;
import com.dimsoft.pockafka.utils.Topics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Component
public class KafkaMailSender {

	private final Logger LOG = LoggerFactory.getLogger(KafkaMailSender.class);
	private KafkaTemplate<String, AvroMail> mailKafkaTemplate;

	@Autowired
	public KafkaMailSender(KafkaTemplate<String, AvroMail> mailKafkaTemplate) {
		this.mailKafkaTemplate = mailKafkaTemplate;
	}

	public void sendMail(Mail mail, String topicName) {
		LOG.info("Sending mail {} to kafka in topic {} !", mail, topicName);
		LOG.info("--------------------------------");

		mailKafkaTemplate.send(topicName, Mapper.mailToAvroMail(mail));
	}

    public void sendMail(Mail mail) {
		this.sendMail(mail, Topics.MAIL_TOPIC);
	}

	public void sendMailWithCallback(Mail mail, String topicName) {
		LOG.info("Sending mail {} to kafka in topic {}, with callback !", mail, topicName);
		LOG.info("---------------------------------");

		ListenableFuture<SendResult<String, AvroMail>> future = mailKafkaTemplate.send(topicName, Mapper.mailToAvroMail(mail));

		future.addCallback(new ListenableFutureCallback<SendResult<String, AvroMail>>() {
			@Override
			public void onSuccess(SendResult<String, AvroMail> result) {
				LOG.info("Success Callback : [{}] delivered with offset - {}", mail,
						result.getRecordMetadata().offset());
			}

			@Override
			public void onFailure(Throwable ex) {
				LOG.warn("Failure Callback: Unable to deliver message [{}]. {}", mail, ex.getMessage());
			}
		});
	}

    public void sendMailWithCallback(Mail mail) {
        this.sendMailWithCallback(mail, Topics.MAIL_TOPIC);
    }
}