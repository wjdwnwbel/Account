package com.example.Account.repository;

import com.example.Account.domain.Account;
import com.example.Account.domain.AccountUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
// Account 테이블에 접속하기 위한 인터페이스
public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findFirstByOrderByIdDesc();
    // 제일 마지막으로 생성된 id
    Optional<Account> findByAccountNumber(String AccountNumber);

    Integer countByAccountUser(AccountUser accountUser);
    List<Account> findByAccountUser(AccountUser accountUser);
}
