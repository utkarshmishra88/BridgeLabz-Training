// Number checker program
import java.util.Scanner;

public class PerfectAbudantDeficientStrongNumber{

    // Method to calculate sum of proper divisors of a number
    public static int sumOfProperDivisors(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to check Perfect Number
    public static boolean isPerfect(int number) {
        return sumOfProperDivisors(number) == number;
    }

    // Method to check Abundant Number
    public static boolean isAbundant(int number) {
        return sumOfProperDivisors(number) > number;
    }

    // Method to check Deficient Number
    // Deficient number = sum of proper divisors less than the number
    public static boolean isDeficient(int number) {
        return sumOfProperDivisors(number) < number;
    }

    // Method to check Strong Number
    public static boolean isStrong(int number) {
        int sum = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp = temp / 10;
        }
        return sum == number;
    }

    // Method to find factorial of a digit
    public static int factorial(int digit) {
        int fact = 1;

        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method
    public static void main(String[] args) {

        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Display results
        System.out.println("Perfect Number: " + isPerfect(number));
        System.out.println("Abundant Number: " + isAbundant(number));
        System.out.println("Deficient Number: " + isDeficient(number));
        System.out.println("Strong Number: " + isStrong(number));

        // Closing scanner
        scanner.close();
    }
}
