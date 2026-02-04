package com.multithreading.bankingsystem;

import java.time.LocalDateTime;

public class BankAccount{

    private int balance = 10000;

    // critical section
    public synchronized boolean withdraw(String name,int amount) {

        System.out.println("["+name+"] Attempting to withdraw "+amount);
        if(balance>=amount){
            balance-=amount;
            System.out.println("Transaction successful: "+name+", Amount: "+amount+", Balance: "+balance+", Time: "+LocalDateTime.now());
            return true;
        }
        System.out.println("Transaction FAILED: "+name+", Amount: "+amount+", Balance: "+balance+", Time: "+LocalDateTime.now());
        return false;
    }

    public int getBalance(){
        return balance;
    }
}
