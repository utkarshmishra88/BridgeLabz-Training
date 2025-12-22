//Java program to find substring and compare them.
import java.util.Scanner;

public class SubstringComparison {

    // Method to create substring using charAt()
    public static String createSubstringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Substring using charAt()
        String substring1 = createSubstringUsingCharAt(text, start, end);

        // Substring using built-in method
        String substring2 = text.substring(start, end);

        // Comparing both substrings
        boolean result = compareStringsUsingCharAt(substring1, substring2);

        // Display results
        System.out.println("\nSubstring using charAt(): " + substring1);
        System.out.println("Substring using substring(): " + substring2);
        System.out.println("Are both substrings equal? " + result);

        sc.close();
    }
}
