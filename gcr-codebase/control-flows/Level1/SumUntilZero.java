//Sum until zero java-program
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize total and variable for input
        double total = 0.0;
        double number;

        // Ask for first input
        System.out.print("Enter a number (0 to stop): ");
        number = sc.nextDouble();

        // While user does not enter 0
        while (number != 0) {
            total += number;  // Add to total

        // Ask for next input
        System.out.print("Enter a number (0 to stop): ");
        number = sc.nextDouble();
        }

        // Display total
        System.out.println("Total sum = " + total);

        sc.close();
    }
}