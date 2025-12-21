// Program of number checker
import java.util.Scanner;

public class NumberCheckerFive{

    // Method to check Prime Number
    // Prime number > 1 and divisible only by 1 and itself
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check Neon Number
    // Sum of digits of square = number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;

        while (square != 0) {
            sum += square % 10;
            square = square / 10;
        }
        return sum == number;
    }

    // Method to check Spy Number
    // Sum of digits = Product of digits
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp = temp / 10;
        }
        return sum == product;
    }

    // Method to check Automorphic Number
    // Square ends with the number itself
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        int temp = number;

        while (temp != 0) {
            if (square % 10 != temp % 10) {
                return false;
            }
            square = square / 10;
            temp = temp / 10;
        }
        return true;
    }

    // Method to check Buzz Number
    // Divisible by 7 OR ends with 7
    public static boolean isBuzz(int number) {
        return (number % 7 == 0 || number % 10 == 7);
    }

    // Main method
    public static void main(String[] args) {

        // Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Taking number input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Prime check
        System.out.println("Prime Number: " + isPrime(number));

        // Neon check
        System.out.println("Neon Number: " + isNeon(number));

        // Spy check
        System.out.println("Spy Number: " + isSpy(number));

        // Automorphic check
        System.out.println("Automorphic Number: " + isAutomorphic(number));

        // Buzz check
        System.out.println("Buzz Number: " + isBuzz(number));

        // Close scanner
        scanner.close();
    }
}
