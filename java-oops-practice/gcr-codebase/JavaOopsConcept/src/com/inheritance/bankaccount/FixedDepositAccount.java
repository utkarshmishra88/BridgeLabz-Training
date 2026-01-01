package com.inheritance.bankaccount;

class FixedDepositAccount extends BankAccount {
    private int tenure; // in months

    FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type   : Fixed Deposit Account");
        System.out.println("Tenure         : " + tenure + " months");
    }
}
