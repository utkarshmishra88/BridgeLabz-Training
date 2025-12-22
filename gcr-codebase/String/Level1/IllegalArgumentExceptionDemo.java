//Java program to demonstrate StringIndexOutOfBoundsException
import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    static void generateException(String text) {
        System.out.println("Substring: " + text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException
    static void handleException(String text) {
        try {
            System.out.println("Substring: " + text.substring(5, 2));
        } 
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException Handled: " + e);
        } 
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException Handled: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        // generates exception
        generateException(text);

        // handles exception
        handleException(text);

        sc.close();
    }
}
