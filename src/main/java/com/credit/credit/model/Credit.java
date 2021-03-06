package com.credit.credit.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@Builder
@Document(collection = "credits")
public class Credit {
    @Id
    public String creditId;
    public String bankId;
    public String numberCredit;
    public String typeAccount;
    public double creditAvailable;
    public double creditConsumed;
    public LocalDate creationDate;
    public LocalDate expirationPayment;
    public String customerId;
    @Transient
    public List<String> transactions;

    public Credit() {
        super();
    }

    public Credit(String creditId, String bankId, String numberCredit, String typeAccount, double creditAvailable, double creditConsumed, LocalDate creationDate, LocalDate expirationPayment, String customerId) {
        this.creditId = creditId;
        this.bankId = bankId;
        this.numberCredit = numberCredit;
        this.typeAccount = typeAccount;
        this.creditAvailable = creditAvailable;
        this.creditConsumed = creditConsumed;
        this.creationDate = creationDate;
        this.expirationPayment = expirationPayment;
        this.customerId = customerId;
    }
}
