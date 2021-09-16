package com.dimsoft.pockafka.api;

import com.dimsoft.pockafka.beans.Mail;
import com.dimsoft.pockafka.dto.GoodMail;
import com.dimsoft.pockafka.dto.BadMail;
import com.dimsoft.pockafka.services.MailService;
import com.dimsoft.pockafka.utils.Mapper;

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
	public ResponseEntity<?> sendMail(@RequestBody GoodMail goodMail) {
		Mail mail = Mapper.mailFromGoodMail(goodMail);
		mailService.sendMailToKafka(mail);
		return new ResponseEntity<>(mail, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/sendbadmail", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> sendBadMail(@RequestBody BadMail badMail) {
		mailService.sendBadMailToKafka(badMail);
		return new ResponseEntity<>(badMail, HttpStatus.OK);
	}
}
