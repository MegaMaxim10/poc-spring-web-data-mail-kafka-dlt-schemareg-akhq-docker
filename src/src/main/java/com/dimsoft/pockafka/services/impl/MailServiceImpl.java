package com.dimsoft.pockafka.services.impl;

import javax.transaction.Transactional;

import com.dimsoft.pockafka.beans.Mail;
import com.dimsoft.pockafka.components.KafkaMailSender;
import com.dimsoft.pockafka.repository.MailRepository;
import com.dimsoft.pockafka.services.MailService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MailServiceImpl implements MailService {
  private final Logger LOG = LoggerFactory.getLogger(MailServiceImpl.class);
  @Autowired
  MailRepository mailRepository;
  @Autowired
  private KafkaMailSender kafkaMailSender;
  @Autowired
  private JavaMailSender emailSender;

  @Override
  public Mail sendMailToKafka(Mail mail) {
    Mail savedMail = mailRepository.save(mail);
    kafkaMailSender.sendMailWithCallback(savedMail);
    return savedMail;
  }

  @Override
  public void sendSimpleMail(Mail mail) {
    SimpleMailMessage message = new SimpleMailMessage(); 
    message.setFrom("noreply@dimsoft.com");
    message.setTo(mail.getMailTo()); 
    message.setSubject(mail.getMailSubject()); 
    message.setText(mail.getMailContent());
	  LOG.info("Service is processing the mail [{}]", mail);
    emailSender.send(message);
  }
}
