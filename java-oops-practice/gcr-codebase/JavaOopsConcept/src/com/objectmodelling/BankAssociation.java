package com.objectmodelling;

public class BankAssociation {
    public static void main(String[] args) {

        Bank sbi = new Bank("SBI");
        Bank hdfc = new Bank("HDFC");

        Customer utkarsh = new Customer("Utkarsh");

        sbi.openAccount(utkarsh, 101, 5000);
        hdfc.openAccount(utkarsh, 202, 12000);

        utkarsh.viewBalance();
    }
}
