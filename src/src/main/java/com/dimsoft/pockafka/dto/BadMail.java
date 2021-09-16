package com.dimsoft.pockafka.dto;

import java.io.Serializable;

/**
 *
 * @author ndadj
 */
public class BadMail implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String mail_to;
    private String mail_subject;
    private String mail_conten;
    private String mail_status;

    public BadMail() {
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

    public String getMail_conten() {
        return mail_conten;
    }

    public void setMail_conten(String mail_conten) {
        this.mail_conten = mail_conten;
    }

    public String getMail_status() {
        return mail_status;
    }

    public void setMail_status(String mail_status) {
        this.mail_status = mail_status;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((mail_conten == null) ? 0 : mail_conten.hashCode());
        result = prime * result + ((mail_status == null) ? 0 : mail_status.hashCode());
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
        BadMail other = (BadMail) obj;
        if (mail_conten == null) {
            if (other.mail_conten != null)
                return false;
        } else if (!mail_conten.equals(other.mail_conten))
            return false;
        if (mail_status == null) {
            if (other.mail_status != null)
                return false;
        } else if (!mail_status.equals(other.mail_status))
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
        return "BadMail [mail_conten=" + mail_conten + ", mail_status=" + mail_status + ", mail_subject=" + mail_subject
                + ", mail_to=" + mail_to + "]";
    }
}