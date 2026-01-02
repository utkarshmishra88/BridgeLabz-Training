package com.ewallet;

public class EWalletApp {
    public static void main(String[] args) {

        User utkarsh = new User("Utkarsh", new PersonalWallet(true));
        User company = new User("TechCorp", new BusinessWallet(false));

        utkarsh.getWallet().loadMoney(10000);
        company.getWallet().loadMoney(50000);

        utkarsh.getWallet().transferTo(company, 3000);
        company.getWallet().transferTo(utkarsh, 5000);

        System.out.println("Utkarsh Balance: ₹" + utkarsh.getWallet().getBalance());
        System.out.println("Company Balance: ₹" + company.getWallet().getBalance());

        System.out.println("\nUtkarsh Transactions:");
        utkarsh.getWallet().showTransactions();
    }
}
