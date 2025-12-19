// Program to find frequency of each digit in a number using arrays
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int temp = number;
        int count = 0;

        // Find the count of digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        // Create array to store digits
        int[] digits = new int[count];
        temp = number;
        int index = 0;
        while (temp != 0) {
            digits[index] = temp % 10;
            temp = temp / 10;
            index++;
        }

        // Frequency array of size 10 (0 to 9)
        int[] frequency = new int[10];

        // Find frequency of each digit
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency of each digit
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }

        sc.close();
    }
}
