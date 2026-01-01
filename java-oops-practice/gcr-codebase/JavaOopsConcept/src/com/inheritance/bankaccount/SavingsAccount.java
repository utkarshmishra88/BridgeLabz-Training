package com.inheritance.bankaccount;

class SavingsAccount extends BankAccount {
    private double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type   : Savings Account");
        System.out.println("Interest Rate : " + interestRate + "%");
    }
}

