package com.markerinterface.sensitivedatatagging;
public class SecurityApp {

    public static void main(String[] args) {

        Object cred = new UserCredentials("utkarsh", "12345");
        Object account = new BankAccount("9876543210");
        Object product = new Product("Laptop");

        EncryptionProcessor.process(cred);
        EncryptionProcessor.process(account);
        EncryptionProcessor.process(product);
    }
}
