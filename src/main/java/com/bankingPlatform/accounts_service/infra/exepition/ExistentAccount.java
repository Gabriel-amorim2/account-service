package com.bankingPlatform.accounts_service.infra.exepition;

public class ExistentAccount extends RuntimeException {
    ExistentAccount(){
        super("a conta com esse CPF já existe");
    }
    public ExistentAccount(String message) {
        super(message);
    }
}
