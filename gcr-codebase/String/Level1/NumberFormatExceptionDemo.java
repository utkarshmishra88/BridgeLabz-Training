//Java program to demonstrate NumberFormatException.
import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    static void generateException(String text) {
        // This will throw NumberFormatException
        int number = Integer.parseInt(text);
        System.out.println("Converted Number: " + number);
    }

    // Method to handle NumberFormatException
    static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Invalid number format");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text value: ");
        String text = sc.next();

        // Calling method to generate exception
        generateException(text);

        // Calling method to handle exception
        handleException(text);

        sc.close();
    }
}
