package com.markerinterface.sensitivedatatagging;
public class BankAccount implements SensitiveData {

    private String accountNumber;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{accountNumber='" + accountNumber + "'}";
    }
}
