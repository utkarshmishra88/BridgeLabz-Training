package com.functionalinterface;
import java.util.Scanner;
import java.util.function.Function;

public class StringLengthChecker {
	
	// Fixed character limit 
    private static final int CHARACTER_LIMIT = 50;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your message");
        String message = scanner.nextLine();
        
        // Function to calculate string length
        Function<String, Integer> lengthFunction = String::length;

        int length = lengthFunction.apply(message);

        if (length > CHARACTER_LIMIT) {
            System.out.println("Message is too long");
            System.out.println("Message length is " + length);
        } else {
            System.out.println("Message is accepted");
            System.out.println("Message length is " + length);
        }

        scanner.close();
    }
}
