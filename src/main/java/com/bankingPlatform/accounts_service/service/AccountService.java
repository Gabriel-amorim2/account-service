package com.bankingPlatform.accounts_service.service;

import com.bankingPlatform.accounts_service.dto.AccountRequest;
import com.bankingPlatform.accounts_service.dto.AccountResponse;
import com.bankingPlatform.accounts_service.entity.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {

    AccountResponse createAccount(AccountRequest accountRequest);
    AccountResponse getMyAccounts();
}
