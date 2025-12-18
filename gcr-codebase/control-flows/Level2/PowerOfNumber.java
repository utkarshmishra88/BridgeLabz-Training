//Java code to find a power of a number.
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
		System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Check for positive integers
        if (number <= 0 || power < 0) {
            System.out.println("Please enter valid positive integers.");
            return;
        }

        int result = 1;
        // Calculate power using for loop
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println(number + " raised to the power " + power + " is " + result);

        sc.close();
    }
}
