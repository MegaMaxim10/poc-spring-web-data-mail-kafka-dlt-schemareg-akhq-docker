package com.dimsoft.pockafka.dto;

import java.io.Serializable;

/**
 *
 * @author ndadj
 */
public class GoodMail implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String mail_to;
    private String mail_subject;
    private String mail_content;
    private short mail_status;

    public GoodMail() {
    }

    public String getMail_to() {
        return mail_to;
    }

    public void setMail_to(String mail_to) {
        this.mail_to = mail_to;
    }

    public String getMail_subject() {
        return mail_subject;
    }

    public void setMail_subject(String mail_subject) {
        this.mail_subject = mail_subject;
    }

    public String getMail_content() {
        return mail_content;
    }

    public void setMail_content(String mail_content) {
        this.mail_content = mail_content;
    }

    public short getMail_status() {
        return mail_status;
    }

    public void setMail_status(short mail_status) {
        this.mail_status = mail_status;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((mail_content == null) ? 0 : mail_content.hashCode());
        result = prime * result + mail_status;
        result = prime * result + ((mail_subject == null) ? 0 : mail_subject.hashCode());
        result = prime * result + ((mail_to == null) ? 0 : mail_to.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GoodMail other = (GoodMail) obj;
        if (mail_content == null) {
            if (other.mail_content != null)
                return false;
        } else if (!mail_content.equals(other.mail_content))
            return false;
        if (mail_status != other.mail_status)
            return false;
        if (mail_subject == null) {
            if (other.mail_subject != null)
                return false;
        } else if (!mail_subject.equals(other.mail_subject))
            return false;
        if (mail_to == null) {
            if (other.mail_to != null)
                return false;
        } else if (!mail_to.equals(other.mail_to))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "GoodMail [mail_content=" + mail_content + ", mail_status=" + mail_status + ", mail_subject="
                + mail_subject + ", mail_to=" + mail_to + "]";
    }
}