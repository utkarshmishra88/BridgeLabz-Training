// Program to store multiple values in an array up to a maximum of 10
// or until the user enters a 0 or a negative number. 
import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array of 10 elements of type double
        double[] numbers = new double[10];

        // declaration of variables
        double total = 0.0;
        int index = 0;

        // Infinite while loop
        while (true) {
            System.out.print("Enter a number: ");
            double input = sc.nextDouble();
            // Break if user enters zero or negative number
            if (input <= 0) {
                break;
            }
            // Break if array size limit is reached
            if (index == 10) {
                break;
            }
            // Store value in array and increment index
            numbers[index] = input;
            index++;
        }
		
        // Calculate the total using for loop
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
        // Display stored numbers
        System.out.println("\nStored numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("\nSum of all numbers: " + total);

        sc.close();
    }
}
