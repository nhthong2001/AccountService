package com.example.accountservice.controller;

import com.example.accountservice.model.Account;
import com.example.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<Optional<Account>> getAccountByUsername(@PathVariable("username") String username){
        return new ResponseEntity<>(accountService.findAccountByUsername(username), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Account> updateAccount(@RequestBody Account account){
        return new ResponseEntity<>(accountService.updateAccount(account), HttpStatus.OK);
    }
}
