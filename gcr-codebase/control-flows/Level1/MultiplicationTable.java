//Java program for Multiplication Table from 6 to 9.
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take integer input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Use for loop to print table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close the Scanner
        sc.close();
    }
}
