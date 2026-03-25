package com.bankingPlatform.core.ledger.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Immutable;

import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Data
@Table(name = "Ledger_transections")
@Immutable
public class  Transaction {

    @Id
    private UUID transactionID;
    @Column(unique = true, nullable = false)
    private String idepotencykey;
    @Enumerated(EnumType.STRING)
    private TransactionType type;
    @Enumerated(EnumType.STRING)
    private TransactionStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime completedAt;
}
