package com.inheritance.bankaccount;

public class BankApp {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount("SB101", 50000, 4.5);
        BankAccount acc2 = new CheckingAccount("CA201", 30000, 10000);
        BankAccount acc3 = new FixedDepositAccount("FD301", 100000, 24);

        acc1.displayAccountDetails();
        acc1.displayAccountType();
        System.out.println();

        acc2.displayAccountDetails();
        acc2.displayAccountType();
        System.out.println();

        acc3.displayAccountDetails();
        acc3.displayAccountType();
    }
}

