package com.spring.q9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankServiceConstructor {

    private AccountRepository accountRepository;
    private TransactionService transactionService;

    @Autowired
    public BankServiceConstructor(
            AccountRepository accountRepository,
            TransactionService transactionService) {

        this.accountRepository = accountRepository;
        this.transactionService = transactionService;
    }

    public void processBanking() {

        accountRepository.checkAccount();

        transactionService.makeTransaction();
    }
}