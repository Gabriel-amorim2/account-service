package com.bankingPlatform.core.account.repository;

import com.bankingPlatform.core.account.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account,Long> {
    Optional<Account> findByUsername(String userId);
    Optional<Account> findByCpf(String cpf);
    void deleteByUsername(String cpf);

}
