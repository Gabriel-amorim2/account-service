package com.bankingPlatform.accounts_service.infra.exepition;

public class NonExistentAccount extends RuntimeException {

    NonExistentAccount(){
        super("conta inexistente");
    }
    public NonExistentAccount(String message){
        super(message);
    }
}
