package com.bankingPlatform.core.account.service;

import com.bankingPlatform.core.account.dto.AccountRequest;
import com.bankingPlatform.core.account.dto.AccountResponse;

public interface AccountService {

    AccountResponse createAccount(AccountRequest accountRequest);
    AccountResponse getMyAccounts();
    AccountResponse deleteAccounts();

}
