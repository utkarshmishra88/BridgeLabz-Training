//Java program to demonstrate ArrayIndexOutOfBoundsException.
import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    static void generateException(String[] names) {
        System.out.println("Name: " + names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    static void handleException(String[] names) {
        try {
            System.out.println("Name: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Invalid index access");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        String[] names = new String[size];
        System.out.println("Enter names:");
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }

        //  generate exception
        generateException(names);

        //  handle exception
        handleException(names);

        sc.close();
    }
}
