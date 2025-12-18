//Java program to find the factorial of an integer using for loop
import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
     	// Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take integer input from user
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        //Logic part to check number is valid or not and also calculate the factorial.
        if (number <= 0) {
            System.out.println("Please enter a valid natural number.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        // Close the Scanner
        sc.close();
    }
}
