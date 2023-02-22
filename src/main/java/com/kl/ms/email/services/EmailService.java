package com.kl.ms.email.services;

import com.kl.ms.email.models.EmailModel;
import com.kl.ms.email.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    EmailRepository emailRepository;

    public void sendEmail(EmailModel emailModel) {

    }
}
