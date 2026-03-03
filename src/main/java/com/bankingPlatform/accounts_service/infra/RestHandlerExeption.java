package com.bankingPlatform.accounts_service.infra;

import com.bankingPlatform.accounts_service.infra.exepition.ExistentAccount;
import com.bankingPlatform.accounts_service.infra.exepition.NonExistentAccount;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestHandlerExeption {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> MethodArgumentNotValidException(MethodArgumentNotValidException exception){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("CPF invalido");
    }

    @ExceptionHandler(NonExistentAccount.class)
    public ResponseEntity<String> ExistentAccount (NonExistentAccount account){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(account.getMessage());
    }
    @ExceptionHandler(ExistentAccount.class)
    public ResponseEntity<String> ExistentAccount (ExistentAccount account){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(account.getMessage());
    }
}
