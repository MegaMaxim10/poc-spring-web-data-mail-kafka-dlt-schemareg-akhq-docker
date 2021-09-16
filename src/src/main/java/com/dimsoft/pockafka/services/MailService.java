package com.dimsoft.pockafka.services;

import com.dimsoft.pockafka.beans.Mail;
import com.dimsoft.pockafka.dto.BadMail;

public interface MailService {
	public void sendMailToKafka(Mail mail);
	public void sendSimpleMail(Mail mail);
	public void sendBadMailToKafka(BadMail mail);
}
