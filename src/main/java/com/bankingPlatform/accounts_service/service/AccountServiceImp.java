package com.bankingPlatform.accounts_service.service;

import com.bankingPlatform.accounts_service.dto.AccountRequest;
import com.bankingPlatform.accounts_service.dto.AccountResponse;
import com.bankingPlatform.accounts_service.entity.Account;
import com.bankingPlatform.accounts_service.infra.exepition.ExistentAccount;
import com.bankingPlatform.accounts_service.mapper.AccountMapper;
import com.bankingPlatform.accounts_service.repository.AccountRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class AccountServiceImp  implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImp(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountResponse createAccount(AccountRequest accountRequest) {

        String username = getLoggedUsername(); // agora é String
        Account account = AccountMapper.mapAccount(accountRequest);
        account.setUsername(username);
        accountRepository.save(account);

        return AccountResponse.builder().mensage("conta criada")
                .accountHolderName(account.getAccountHolderName())
                .cpf(account.getCpf())
                .balance(account.getBalance())
                .username(account.getUsername()).build();


    }


    @Override
    public AccountResponse getMyAccounts() {
        String username = getLoggedUsername();
        Optional<Account> response =  accountRepository.findByUsername(username);
        if (!response.isPresent()){
            throw new ExistentAccount("conta inexistente");
        }
        var account = response.get();
        return AccountResponse.builder()
                .mensage("sua conta:")
                .accountHolderName(account.getAccountHolderName())
                .cpf(account.getCpf())
                .balance(account.getBalance())
                .username(account.getUsername()).build();


    }

    private String getLoggedUsername() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return auth.getName();
    }



}
