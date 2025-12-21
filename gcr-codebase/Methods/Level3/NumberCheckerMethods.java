// Program of number checker

import java.util.Scanner;

public class NumberCheckerMethods{

    // Method to count the number of digits in a number
    public static int countDigits(int number) {
        int count = 0;

        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    // Method to store digits of the number in an array
    public static int[] storeDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];

        int index = digitCount - 1;

        while (number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index--;
        }
        return digits;
    }

    // Method to find the sum of digits using digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;

        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of squares of digits
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check Harshad Number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }

        // Count frequency
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Calling methods
        int digitCount = countDigits(number);
        int[] digits = storeDigits(number);

        // Display digits
        System.out.print("\nDigits of the number: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }

        System.out.println("\nNumber of Digits: " + digitCount);

        // Sum of digits
        int sumDigits = sumOfDigits(digits);
        System.out.println("Sum of Digits: " + sumDigits);

        // Sum of squares of digits
        int sumSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of Squares of Digits: " + sumSquares);

        // Harshad number check
        if (isHarshadNumber(number, digits)) {
            System.out.println("The number is a Harshad Number");
        } else {
            System.out.println("The number is NOT a Harshad Number");
        }

        // Digit frequency
        int[][] frequency = digitFrequency(digits);

        System.out.println("\nDigit Frequency:");
        System.out.println("Digit  Frequency");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("  " + frequency[i][0] + "        " + frequency[i][1]);
            }
        }

        // Close scanner stream
        sc.close();
    }
}
