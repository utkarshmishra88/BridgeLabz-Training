package com.multithreading.bankingsystem;

public class Transaction implements Runnable{

    private BankAccount account;
    private String name;
    private int amount;

    public Transaction(BankAccount account,String name,int amount){
        this.account=account;
        this.name=name;
        this.amount=amount;
    }

    @Override
    public void run() {
        try{
            Thread.sleep((int)(Math.random()*400)); // random delay
        }catch(Exception e){}

        account.withdraw(name,amount);
    }
}
