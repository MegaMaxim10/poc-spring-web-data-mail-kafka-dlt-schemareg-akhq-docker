package com.dimsoft.pockafka.components;

import com.dimsoft.pockafka.beans.Mail;
import com.dimsoft.pockafka.repository.MailRepository;
import com.dimsoft.pockafka.schemas.AvroMail;
import com.dimsoft.pockafka.services.MailService;
import com.dimsoft.pockafka.utils.Mapper;
import com.dimsoft.pockafka.utils.Topics;

import java.lang.Exception;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.kafka.retrytopic.TopicSuffixingStrategy;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.retry.annotation.Backoff;
import org.springframework.stereotype.Component;

@Component
public class KafkaMailProcessor {
    private final Logger LOG = LoggerFactory.getLogger(KafkaMailProcessor.class);
    @Autowired
    private MailService mailService;
    @Autowired
    private MailRepository mailRepository;

    @RetryableTopic(
      attempts = "1",
      backoff = @Backoff(delay = 1000, multiplier = 2.0),
      autoCreateTopics = "true",
      kafkaTemplate = "mailKafkaTemplate",
      topicSuffixingStrategy = TopicSuffixingStrategy.SUFFIX_WITH_INDEX_VALUE)
    @KafkaListener(topics = Topics.MAIL_TOPIC, groupId = Topics.MAIL_GROUP, containerFactory = "mailKafkaListenerContainerFactory")
	public void mailListener(ConsumerRecord<String, AvroMail> message) throws Exception {
        AvroMail avroMail = message.value();
        if (avroMail instanceof BadAvroMail) {
            LOG.info("Received a bad avro mail");
            throw new Exception("");
        }
        Mail mail = Mapper.mailFromAvroMail(avroMail);
		LOG.info("Kafka mail listener [{}]", mail);
        if (mail.getMailSubject().equals("Throw Exception")) {
            LOG.info("Throwing an exception in consumer");
            throw new Exception("");
        }
        LOG.info("Spring will now try to send the email [{}]", mail);
        try {
			mailService.sendSimpleMail(mail);
		} catch(Exception e) {
			LOG.info("An exception was caught");
			e.printStackTrace();
			throw new Exception(e);
		}
        LOG.info("Spring will now try to save the email with status to 1");
        mail.setMailStatus((short)1);
        mailRepository.save(mail);
	}

    @DltHandler
    public void dlt(ConsumerRecord<String, AvroMail> message, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic) {
        AvroMail avroMail = message.value();
        Mail mail = Mapper.mailFromAvroMail(avroMail);
        LOG.info("Received mail {} from topic {} in DLT.", mail, topic);
    }
}
