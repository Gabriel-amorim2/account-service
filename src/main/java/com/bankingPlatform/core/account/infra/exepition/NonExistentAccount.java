package com.bankingPlatform.core.account.infra.exepition;

public class NonExistentAccount extends RuntimeException {

    NonExistentAccount(){
        super("conta inexistente");
    }
    public NonExistentAccount(String message){
        super(message);
    }
}
