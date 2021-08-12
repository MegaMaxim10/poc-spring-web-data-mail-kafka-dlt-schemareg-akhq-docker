package com.dimsoft.pockafka.beans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ndadj
 */
@Entity
@Table(name = "mail")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Mail.findAll", query = "SELECT m FROM Mail m"),
        @NamedQuery(name = "Mail.findByMailId", query = "SELECT m FROM Mail m WHERE m.mailId = :mailId"),
        @NamedQuery(name = "Mail.findByMailStatus", query = "SELECT m FROM Mail m WHERE m.mailStatus = :mailStatus") })

public class Mail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "mail_id", nullable = false)
    private Integer mailId;
    @Column(name = "mail_to", length = 255)
    private String mailTo;
    @Column(name = "mail_subject", length = 255)
    private String mailSubject;
    @Column(name = "mail_content", length = 2555555)
    private String mailContent;
    @Basic(optional = false)
    @Column(name = "mail_status", nullable = false)
    private short mailStatus;

    public Mail() {
    }

    public Mail(Integer mailId) {
        this.mailId = mailId;
    }

    public Integer getMailId() {
        return mailId;
    }

    public void setMailId(Integer mailId) {
        this.mailId = mailId;
    }

    public String getMailTo() {
        return mailTo;
    }

    public void setMailTo(String mailTo) {
        this.mailTo = mailTo;
    }

    public String getMailSubject() {
        return mailSubject;
    }

    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
    }

    public String getMailContent() {
        return mailContent;
    }

    public void setMailContent(String mailContent) {
        this.mailContent = mailContent;
    }

    public short getMailStatus() {
        return mailStatus;
    }

    public void setMailStatus(short mailStatus) {
        this.mailStatus = mailStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mailId != null ? mailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Mail)) {
            return false;
        }
        Mail other = (Mail) object;
        if ((this.mailId == null && other.mailId != null)
                || (this.mailId != null && !this.mailId.equals(other.mailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dimsoft.pockafka.beans.Mail[ mailId=" + mailId + ", mailTo=" + mailTo + ", mailSubject=" + mailSubject + ", mailContent=" + mailContent + ", mailStatus=" + mailStatus + " ]";
    }
}