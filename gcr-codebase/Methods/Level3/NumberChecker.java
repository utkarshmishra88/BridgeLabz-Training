// Number Checker program

import java.util.Scanner;

public class NumberChecker{

    // Method to count number of digits in the number
    public static int countDigits(int number) {
        int count = 0;

        while (number != 0) {
            count++;
            number = number / 10;
        }

        return count;
    }

    // Method to store digits of the number into an array
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

    // Method to check Duck Number
    // A Duck number has at least one non-zero digit
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check Armstrong Number
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;

        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }

        return sum == number;
    }

    // Method to find largest and second largest digits
    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    }

    // Method to find smallest and second smallest digits
    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        System.out.println("Smallest Digit: " + smallest);
        System.out.println("Second Smallest Digit: " + secondSmallest);
    }

    // Main method 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        // Duck Number check
        if (isDuckNumber(digits)) {
            System.out.println("The number is a Duck Number");
        } else {
            System.out.println("The number is NOT a Duck Number");
        }

        // Armstrong Number check
        if (isArmstrongNumber(number, digits)) {
            System.out.println("The number is an Armstrong Number");
        } else {
            System.out.println("The number is NOT an Armstrong Number");
        }

        // Largest and Second Largest
        System.out.println("\nLargest and Second Largest Digits:");
        findLargestAndSecondLargest(digits);

        // Smallest and Second Smallest
        System.out.println("\nSmallest and Second Smallest Digits:");
        findSmallestAndSecondSmallest(digits);

        // Closing scanner
        sc.close();
    }
}
