package com.bankingPlatform.accounts_service.service;

import com.bankingPlatform.accounts_service.dto.AccountDTO;
import com.bankingPlatform.accounts_service.entity.Account;

import java.util.List;

public interface AccountService {

    Account createAccount(AccountDTO accountDTO);
    List<Account> getMyAccounts();
}
