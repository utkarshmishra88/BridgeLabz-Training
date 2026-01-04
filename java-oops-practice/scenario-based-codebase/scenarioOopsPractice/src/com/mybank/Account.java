package com.mybank;

public abstract class Account implements ITransaction {

	// instance variable
	protected String accountNumber;
	private double balance;

	// constructor without opening account
	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}

	// constructor with opening balance
	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// deposit method
	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		} else {
			System.out.println("Deposit Amount can not be in negative ");
		}
	}

	// withdraw amount
	@Override
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Invalid amount or Insufficient balance");
		}
	}

	// method to show balance
	@Override
	public double checkBalance() {
		return balance;
	}

	// Protected method for interest calculation
	protected double getBalanceForInterest() {
		return balance;
	}

	// Abstract method for interest (Polymorphism)
	public abstract double calculateInterest();
}
