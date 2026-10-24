package com.jsp.Model;

public class Bank {

    private String bankName;
    private Account account;

    public void displayBank() {
        System.out.println("Bank Name: " + bankName);
        account.displayAccount();
    }


    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}