//Java Code to check whether a number is Positive, Negative, or Zero
import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Read number input
        int number = input.nextInt();

        // Check whether the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        // Close the scanner
        input.close();
    }
}