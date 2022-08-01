package com.example.accountservice.service;


import com.example.accountservice.model.Account;
import com.example.accountservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    private AccountRepository accountRepository;
    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    public Optional<Account> findAccountByUsername(String username){
        Optional<Account> ac =  accountRepository.findByUsername(username);
        ac.get().password = "";
        return ac;
    }

    public List<Account> getAllAccount() {
        return accountRepository.findAll();
    }

    public Account updateAccount(Account account) {
        return accountRepository.save(account);
    }
}
