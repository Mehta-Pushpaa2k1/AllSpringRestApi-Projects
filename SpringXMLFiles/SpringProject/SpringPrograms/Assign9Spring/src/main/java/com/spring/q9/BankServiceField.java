package com.spring.q9;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankServiceField {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private TransactionService transactionService;

    public void processBanking() {

        accountRepository.checkAccount();

        transactionService.makeTransaction();
    }
}