package com.bankingPlatform.accounts_service.service;

import com.bankingPlatform.accounts_service.dto.AccountRequest;
import com.bankingPlatform.accounts_service.dto.AccountResponse;

public interface AccountService {

    AccountResponse createAccount(AccountRequest accountRequest);
    AccountResponse getMyAccounts();

}
