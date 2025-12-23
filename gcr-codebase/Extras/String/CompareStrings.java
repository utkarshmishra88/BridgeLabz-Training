// Java program to compare two strings
import java.util.Scanner;

public class CompareStrings {

    // Method to compare strings lexicographically
    public static void compareStrings(String s1, String s2) {

        int minLength = Math.min(s1.length(), s2.length());

        for (int i = 0; i < minLength; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 < c2) {
                System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
                return;
            } 
            else if (c1 > c2) {
                System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\" in lexicographical order");
                return;
            }
        }

        // If all characters are equal so far
        if (s1.length() < s2.length()) {
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
        } 
        else if (s1.length() > s2.length()) {
            System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\" in lexicographical order");
        } 
        else {
            System.out.println("Both strings are equal");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        compareStrings(str1, str2);
        
		// Closing scanner stream
        sc.close();
    }
}
