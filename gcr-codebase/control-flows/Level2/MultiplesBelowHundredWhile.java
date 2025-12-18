// Program to find all the multiples (divisors) of a given number below 100 using while loop

import java.util.Scanner;

public class MultiplesBelowHundredWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number less than 100: ");
        int number = sc.nextInt();

        // Check for valid positive integer less than 100
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
            return;
        }

        int counter = number - 1;
        System.out.println("Multiples (divisors) of " + number + " below 100:");

        // While loop to find multiples
        while (counter > 1) {
            if (number % counter == 0) {
                System.out.println(counter);
            }
            counter--;
        }

        sc.close();
    }
}
