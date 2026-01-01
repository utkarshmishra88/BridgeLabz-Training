package com.inheritance.bankaccount;

class BankAccount {
    protected String accountNumber;
    protected double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : ₹" + balance);
    }

    public void displayAccountType() {
        System.out.println("Account Type   : Bank Account");
    }
}

