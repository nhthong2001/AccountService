package com.example.accountservice.service;


import com.example.accountservice.model.Account;
import com.example.accountservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    private AccountRepository accountRepository;
    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    public Account findAccountByUsername(String username){
        return accountRepository.findByUsername(username);
    }

    public List<Account> getAllAccount() {
        return accountRepository.findAll();
    }
}
