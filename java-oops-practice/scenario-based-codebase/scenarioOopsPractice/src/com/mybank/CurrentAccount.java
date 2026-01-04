package com.mybank;

//CurrentAccount class
public class CurrentAccount extends Account {

	private final double interestRate = 2; // 2%

	public CurrentAccount(String accountNumber) {
		super(accountNumber);
	}

	public CurrentAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	// Interest calculation for current account
	@Override
	public double calculateInterest() {
		return getBalanceForInterest() * interestRate / 100;
	}
}