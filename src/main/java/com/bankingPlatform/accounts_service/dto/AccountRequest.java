package com.bankingPlatform.accounts_service.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountRequest {
    private String accountHolderName;

    @NotBlank
    @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}"
            , message = "formato do CPF invalido")
    private String cpf;
}

