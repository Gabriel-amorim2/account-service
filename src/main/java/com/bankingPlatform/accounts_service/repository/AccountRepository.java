package com.bankingPlatform.accounts_service.repository;

import com.bankingPlatform.accounts_service.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account,Long> {
    Optional<Account> findByUsername(String userId);
    Optional<Account> findByCpf(String cpf);
    void deleteByUsername(String cpf);

}
