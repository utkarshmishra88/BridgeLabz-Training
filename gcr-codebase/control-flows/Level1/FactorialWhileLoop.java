//Java program to find the factorial of an integer
import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take integer input from user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the number is a positive integer
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Initialize factorial result and counter
            long factorial = 1;
            int i = 1;
            while (i <= number) {
                factorial = factorial * i;
                i++;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        // Close the Scanner
        sc.close();
    }
}
