package com.bankingPlatform.accounts_service.mapper;

import com.bankingPlatform.accounts_service.dto.AccountRequest;
import com.bankingPlatform.accounts_service.entity.Account;

public class AccountMapper {

    public static Account mapAccount(AccountRequest dto) {
        if (dto == null) return null;

        Account account = new Account();
        account.setAccountHolderName(dto.getAccountHolderName());
        account.setBalance(0.0);
        account.setCpf(dto.getCpf());
        return account;
    }

//    public static AccountDTO mapAccountDto(Account account) {
//        if (account == null) return null;
//
//        AccountDTO dto = new AccountDTO();
//        dto.setAccountHolderName(account.getAccountHolderName());
//        dto.setCpf(account.getCpf());
//        dto.setUsername();
//        return dto;
//
//
//   }
}
