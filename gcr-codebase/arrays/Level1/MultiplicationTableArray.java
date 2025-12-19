// Program to print the multiplication table of a given number using an array
import java.util.Scanner;

public class MultiplicationTableArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Define an integer array to store multiplication results from 1 to 10
        int[] table = new int[10];

        // Store multiplication results in the array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display the multiplication table
        System.out.println("\nMultiplication Table:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}
