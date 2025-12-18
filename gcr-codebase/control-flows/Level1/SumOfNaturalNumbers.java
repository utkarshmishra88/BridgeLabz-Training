//Java code to find sum using while loop and formula and also compare them.
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check for natural number
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
            return;
        }

        // Sum using while loop
        int sumWhile = 0;
        int i = 1;
        while (i <= n) {
            sumWhile += i;
            i++;
        }

        // Sum using formula
        int sumFormula = n * (n + 1) / 2;

        // Print results
        System.out.println("Sum using while loop: " + sumWhile);
        System.out.println("Sum using formula n*(n+1)/2: " + sumFormula);

        // Compare both results
        if (sumWhile == sumFormula) {
            System.out.println("Both computations are correct and equal.");
        } else {
            System.out.println("The computations are not equal.");
        }

        sc.close();
    }
}
