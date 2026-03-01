package com.bankingPlatform.accounts_service.controller;


import com.bankingPlatform.accounts_service.dto.AccountDTO;
import com.bankingPlatform.accounts_service.entity.Account;
import com.bankingPlatform.accounts_service.service.AccountServiceImp;
import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {


    private final AccountServiceImp accountService;

    public AccountController(AccountServiceImp accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/create-account")
    public ResponseEntity<Account> addAccount(@Valid @RequestBody AccountDTO accountDTO ){
        var count =  accountService.createAccount(accountDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(count);
    }
}
