package com.bankingPlatform.core.ledger.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Table(name = "Ledger_transections")
public class LedgerTransections {

    @Id
    private UUID transactionID;
    private TransactionType type;
    private TransactionStatus status;
    private String idempotencyKey;
    private LocalDateTime createdAt;
}
