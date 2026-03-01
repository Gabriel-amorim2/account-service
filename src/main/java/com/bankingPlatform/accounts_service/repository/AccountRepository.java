package com.bankingPlatform.accounts_service.repository;

import com.bankingPlatform.accounts_service.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account,Long> {
    List<Account> findByUsername(String userId);

}
