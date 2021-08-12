package com.dimsoft.pockafka.api;

import com.dimsoft.pockafka.beans.Mail;
import com.dimsoft.pockafka.services.MailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/mailer")
public class MailSenderController {
    @Autowired
	MailService mailService;

    @RequestMapping(method = RequestMethod.POST, value = "/sendmail", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> sendMail(@RequestBody Mail mail) {
		Mail createdMail = mailService.sendMailToKafka(mail);
		return new ResponseEntity<>(createdMail, HttpStatus.OK);
	}
}
