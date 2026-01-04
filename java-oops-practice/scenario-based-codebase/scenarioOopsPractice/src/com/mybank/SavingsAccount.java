package com.mybank;

//SavingsAccount class
public class SavingsAccount extends Account {

	private final double interestRate = 4; // 4%

	public SavingsAccount(String accountNumber) {
		super(accountNumber);
	}

	public SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	// Interest calculation for savings account
	@Override
	public double calculateInterest() {
		return getBalanceForInterest() * interestRate / 100;
	}
}
