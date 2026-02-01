package com.staticmethodininterface.passwordstrengthvalidator;
import java.util.Scanner;

public class PasswordValidatorApp {
	
	//Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        // Call the static method from the interface
        boolean result = SecurityUtils.isStrongPassword(password);

        if (result)
            System.out.println("Strong Password");
        else
            System.out.println("Weak Password");

        sc.close();
    }
}
