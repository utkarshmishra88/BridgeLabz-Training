// Program for factor operations

import java.util.Scanner;

public class FactorOperations{

    // Method to find all factors of a number and return them as an array
    public static int[] findFactors(int number) {

        // First loop: count the number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array of exact size
        int[] factors = new int[count];

        // Second loop: store factors in array
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find the greatest factor using factors array
    public static int findGreatestFactor(int[] factors) {
        int greatest = factors[0];

        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }

    // Method to find the sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;

        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of factors
    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;

        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Main method
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find factors
        int[] factors = findFactors(number);

        // Display factors
        System.out.print("\nFactors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        // Display results
        System.out.println("\nGreatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));

        // Close scanner
        scanner.close();
    }
}
