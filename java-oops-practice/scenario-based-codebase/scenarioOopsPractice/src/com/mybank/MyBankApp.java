package com.mybank;
import java.util.Scanner;

//Main class using enhanced switch
public class MyBankApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter Account Number: ");
		String accountNumber = input.nextLine();

		System.out.print("Enter Opening Balance (0 if none): ");
		double openingBalance = input.nextDouble();

		System.out.println("\nSelect Account Type:");
		System.out.println("1. Savings Account");
		System.out.println("2. Current Account");
		System.out.print("Enter choice: ");
		int choice = input.nextInt();

		Account account;

		// Enhanced switch (Java 14+)
		account = switch (choice) {
		case 1 -> new SavingsAccount(accountNumber, openingBalance);
		case 2 -> new CurrentAccount(accountNumber, openingBalance);
		default -> {
			System.out.println("Invalid account type");
			input.close();
			yield null;
		}
		};

		if (account == null)
			return;

		System.out.print("\nEnter deposit amount: ");
		double depositAmount = input.nextDouble();
		account.deposit(depositAmount);

		System.out.print("Enter withdraw amount: ");
		double withdrawAmount = input.nextDouble();
		account.withdraw(withdrawAmount);

		System.out.println("\nCurrent Balance: " + account.checkBalance());
		System.out.println("Interest Earned: " + account.calculateInterest());

		input.close(); //closing input stream
	}
}