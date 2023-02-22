package com.kl.ms.email.models;

import com.kl.ms.email.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tb_email")
public class EmailModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailModel that = (EmailModel) o;

        return emailId.equals(that.emailId);
    }

    @Override
    public int hashCode() {
        return emailId.hashCode();
    }
}
