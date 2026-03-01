package com.bankingPlatform.accounts_service.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class AccountResponse {

    private String mensage;
    private String accountHolderName;
    private String cpf;
    private double balance;
    private String username;

}
