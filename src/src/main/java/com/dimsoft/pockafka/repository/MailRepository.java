package com.dimsoft.pockafka.repository;

import com.dimsoft.pockafka.beans.Mail;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MailRepository extends JpaRepository<Mail, Integer> {
    List<Mail> findByMailStatus(boolean mailStatus);
}
