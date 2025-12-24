// Program to find factorial of number using recursion
import java.util.Scanner;

public class FactorialUsingRecursion {

    // Recursive method to calculate factorial
    public static long factorial(int number) {

        if (number == 0 || number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
		// Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        long result = factorial(number);
		
        // Display result
        System.out.println("Factorial: " + result);
        
		// Closing scanner stream
        input.close();
    }
}
