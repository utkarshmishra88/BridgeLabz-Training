// Java program to count how many times a given substring occurs in a string
import java.util.Scanner;

public class SubstringOccurrences {

    // Method to count substring occurrences
    public static int countOccurrences(String str, String sub) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index = index + sub.length(); // move forward
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
		// Take user input
        System.out.print("Enter the main string: ");
        String str = sc.nextLine();
		System.out.print("Enter the substring: ");
        String sub = sc.nextLine();
		
        // Displaying the result
        int result = countOccurrences(str, sub);
        System.out.println("Substring occurs " + result + " times.");
        
		// Closing scanner stream
        sc.close();
    }
}
