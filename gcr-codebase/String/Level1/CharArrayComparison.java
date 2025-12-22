//Java program to return all the characters in a string.
import java.util.Scanner;

public class CharArrayComparison {

    // User-defined method to return characters of a string
    public static char[] getCharsUsingMethod(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.next();

        // User-defined method
        char[] userDefinedArray = getCharsUsingMethod(text);
        // Built-in method
        char[] builtInArray = text.toCharArray();

        boolean result = compareCharArrays(userDefinedArray, builtInArray);

        // Display result
        System.out.println("Characters using user-defined method:");
        for (char c : userDefinedArray) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nCharacters using toCharArray():");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both character arrays equal? " + result);

        sc.close();
    }
}
