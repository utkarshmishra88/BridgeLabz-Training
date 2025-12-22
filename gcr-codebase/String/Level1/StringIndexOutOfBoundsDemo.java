//Java program to demonstrate StringIndexOutOfBoundsException
import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    static void generateException(String text) {
        System.out.println("Character: " + text.charAt(text.length()));
    }

    // Method to handle StringIndexOutOfBoundsException
    static void handleException(String text) {
        try {
            System.out.println("Character: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Handled: " + e);
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
