// Program to find the power of a number using while loop
import java.util.Scanner;

public class PowerUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Check for valid input
        if (number <= 0 || power < 0) {
            System.out.println("Please enter valid positive integers.");
            return;
        }

        // Initialize variables and calculate power using while loop
        int result = 1;
        int counter = 0;
        while (counter != power) {
            result = result * number;
            counter++;
        }
        System.out.println(number + " raised to the power " + power + " is " + result);

        sc.close();
    }
}
