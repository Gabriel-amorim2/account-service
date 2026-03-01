package com.bankingPlatform.accounts_service.infra.exepition;

public class ExistentAccount extends RuntimeException {

    ExistentAccount(){
        super("conta inexistente");
    }
    public ExistentAccount(String message){
        super(message);
    }
}
