package com.example.accountservice.controller;

import com.example.accountservice.model.Account;
import com.example.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public ResponseEntity<List<Account>> getAllAccount(){
        return new ResponseEntity<>(accountService.getAllAccount(), HttpStatus.OK);
    }

    @GetMapping("/{username}")
    public  ResponseEntity<Account> getAccountByUsername(@PathVariable("username") String username){
        Account account = accountService.findAccountByUsername(username);
        if (account == null) return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }
}
