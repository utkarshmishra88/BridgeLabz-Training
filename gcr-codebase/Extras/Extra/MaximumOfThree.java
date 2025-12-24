// Program to find the maximum of the three numbers

import java.util.Scanner;

public class MaximumOfThree {

    // Method to find maximum of three numbers
    public static int findMaximum(int number1, int number2, int number3) {

        int max = number1;

        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        int max = findMaximum(number1, number2, number3);

        System.out.println("Maximum number is: " + max);
        
		// Closing scanner stream
        input.close();
    }
}

