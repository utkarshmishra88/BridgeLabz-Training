// Java program to find the most frequent character in a string
import java.util.Scanner;

public class MostFrequentCharacter {

    // Method to find most frequent character
    public static char findMostFrequentChar(String str) {
        int[] freq = new int[256]; // ASCII characters

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int maxCount = 0;
        char result = ' ';

        // Find the character with maximum frequency
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > maxCount) {
                maxCount = freq[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
		// Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
		// Display the result
        char mostFrequent = findMostFrequentChar(input);
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
         
		// Closing scanner stream
        sc.close();
    }
}
