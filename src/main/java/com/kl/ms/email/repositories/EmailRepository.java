package com.kl.ms.email.repositories;

import com.kl.ms.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
