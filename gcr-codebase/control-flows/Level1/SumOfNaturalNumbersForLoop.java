//Java code to find sum using while loop and formula and also compare them.(using for loop)
import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
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

        // Sum using for loop
        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }

        // Sum using formula
        int sumFormula = n * (n + 1) / 2;

        // Print results
        System.out.println("Sum using for loop: " + sumFor);
        System.out.println("Sum using formula n*(n+1)/2: " + sumFormula);

        // Compare both results
        if (sumFor == sumFormula) {
            System.out.println("Both computations are correct and equal.");
        } else {
            System.out.println("The computations are not equal.");
        }

        sc.close();
    }
}
