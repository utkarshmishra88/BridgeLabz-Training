package com.inheritance.bankaccount;

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type   : Checking Account");
        System.out.println("Withdrawal Limit : ₹" + withdrawalLimit);
    }
}

