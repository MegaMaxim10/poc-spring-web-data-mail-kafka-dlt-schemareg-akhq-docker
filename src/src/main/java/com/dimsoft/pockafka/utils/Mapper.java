package com.dimsoft.pockafka.utils;

import com.dimsoft.pockafka.beans.Mail;
import com.dimsoft.pockafka.schemas.AvroMail;

public class Mapper {
    public static AvroMail mailToAvroMail(Mail mail) {
        return AvroMail.newBuilder()
                       .setMailId(mail.getMailId())
                       .setMailTo(mail.getMailTo())
                       .setMailSubject(mail.getMailSubject())
                       .setMailContent(mail.getMailContent())
                       .setMailStatus(mail.getMailStatus())
                       .build();
    }

    public static Mail mailFromAvroMail(AvroMail avroMail) {
        Mail mail = new Mail();
        mail.setMailId(avroMail.getMailId());
        mail.setMailTo(avroMail.getMailTo().toString());
        mail.setMailSubject(avroMail.getMailSubject().toString());
        mail.setMailContent(avroMail.getMailContent().toString());
        mail.setMailStatus((short)avroMail.getMailStatus().intValue());
        return mail;
    }
}
