// Program to check whether numbers are positive, negative, or zero
// Also checks even/odd for positive numbers and compares first & last elements
import java.util.Scanner;

public class NumberCheckInArray {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

        // Define an integer array of 5 elements
        int[] numbers = new int[5];

        // Take user input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("\nNumber Analysis:");

        // Loop through the array
        for (int i = 0; i < numbers.length; i++) {
     		if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is a positive even number");
                } else {
                    System.out.println(numbers[i] + " is a positive odd number");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is a negative number");
            } else {
                System.out.println(numbers[i] + " is zero");
            }
        }

        // Compare first and last elements
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.println("\nComparison of first and last elements:");

        if (first == last) {
            System.out.println("First and last elements are equal");
        } else if (first > last) {
            System.out.println("First element is greater than last element");
        } else {
            System.out.println("First element is less than last element");
        }

        input.close();
    }
}
