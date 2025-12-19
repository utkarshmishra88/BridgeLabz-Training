// Program to print the multiplication table of a number from 6 to 9

import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Define an integer array to store multiplication results (6 to 9)
        int[] multiplicationResult = new int[4];

        // Calculate multiplication table from 6 to 9 and display
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }
        System.out.println("\nMultiplication Table (6 to 9):");
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }

        sc.close();
    }
}
