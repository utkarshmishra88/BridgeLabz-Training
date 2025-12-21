// Number checker program

import java.util.Scanner;

public class NumberCheckerFour{

    // Method to count the number of digits in a number
    public static int countDigits(int number) {
        int count = 0;

        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    // Method to store digits of a number in an array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        int index = count - 1;

        while (number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index--;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check Palindrome Number using digits
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check Duck Number
    // A Duck number contains at least one non-zero digit
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

        // Main method
        public static void main(String[] args) {

        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking number input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Store digits
        int[] digits = storeDigits(number);

        // Display digits
        System.out.print("\nDigits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }

        // Reverse digits
        int[] reversed = reverseDigits(digits);
        System.out.print("\nReversed Digits: ");
        for (int digit : reversed) {
            System.out.print(digit + " ");
        }

        // Compare arrays
        System.out.println("\nArrays Equal: " + areArraysEqual(digits, reversed));

        // Palindrome check
        if (isPalindrome(digits)) {
            System.out.println("The number is a Palindrome Number");
        } else {
            System.out.println("The number is NOT a Palindrome Number");
        }

        // Duck number check
        if (isDuckNumber(digits)) {
            System.out.println("The number is a Duck Number");
        } else {
            System.out.println("The number is NOT a Duck Number");
        }

        // Close scanner stream
        scanner.close();
    }
}
