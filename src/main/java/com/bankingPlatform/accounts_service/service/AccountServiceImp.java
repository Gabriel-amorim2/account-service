package com.bankingPlatform.accounts_service.service;

import com.bankingPlatform.accounts_service.dto.AccountDTO;
import com.bankingPlatform.accounts_service.entity.Account;
import com.bankingPlatform.accounts_service.mapper.AccountMapper;
import com.bankingPlatform.accounts_service.repository.AccountRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImp  implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImp(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account createAccount(AccountDTO accountDTO) {

        String username = getLoggedUsername(); // agora é String

        Account account = AccountMapper.mapAccount(accountDTO);
        account.setUsername(username);
        return accountRepository.save(account);


    }


    @Override
    public List<Account> getMyAccounts() {
        String username = getLoggedUsername();
        return accountRepository.findByUsername(username);

    }

    private String getLoggedUsername() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return auth.getName();
    }



}
