package com.bankingPlatform.accounts_service.infra.exepition;

public class ExistentAccount extends RuntimeException {
    ExistentAccount(){
        super("account already exists");
    }
    public ExistentAccount(String message) {
        super(message);
    }
}
