package com.objectmodelling;

public class Bank {
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public Account openAccount(Customer customer, int accNo, double balance) {
        Account account = new Account(accNo, balance, this);
        customer.addAccount(account);
        System.out.println("Account opened in " + bankName);
        return account;
    }
}
