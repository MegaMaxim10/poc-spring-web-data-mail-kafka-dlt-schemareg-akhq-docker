package com.dimsoft.pockafka.services;

import com.dimsoft.pockafka.beans.Mail;

public interface MailService {
	public Mail sendMailToKafka(Mail mail);
	public void sendSimpleMail(Mail mail);
}
