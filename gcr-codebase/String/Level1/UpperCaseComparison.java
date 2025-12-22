//Java program to convert the complete text to uppercase and compare the results.
import java.util.Scanner;

public class UpperCaseComparison {

    // Method to convert string to uppercase
    public static String convertToUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); 
            }
            result = result + ch;
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
	//main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the complete text:");
        String text = sc.nextLine();

        // User-defined uppercase conversion
        String customUpper = convertToUpper(text);

        // Built-in uppercase conversion
        String builtInUpper = text.toUpperCase();

        boolean result = compareStrings(customUpper, builtInUpper);

        // output
        System.out.println("Custom Uppercase   : " + customUpper);
        System.out.println("Built-in Uppercase : " + builtInUpper);
        System.out.println("Are both equal?    : " + result);

        sc.close();
    }
}
