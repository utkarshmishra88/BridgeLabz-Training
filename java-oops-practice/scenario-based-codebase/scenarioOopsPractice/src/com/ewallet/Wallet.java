package com.ewallet;

import java.util.ArrayList;
import java.util.List;

abstract class Wallet implements Transferrable {

    private double balance;   // 🔒 Encapsulation
    protected List<Transaction> transactions = new ArrayList<>();

    // Constructor with optional referral bonus
    public Wallet(boolean referral) {
        if (referral) {
            this.balance += 50; // referral bonus
        }
    }

    public double getBalance() {
        return balance;
    }

    protected void addBalance(double amount) {
        balance += amount;
    }

    protected void deductBalance(double amount) {
        balance -= amount;
    }

    public void loadMoney(double amount) {
        addBalance(amount);
        transactions.add(new Transaction("Money Loaded", amount));
    }

    public void showTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}
