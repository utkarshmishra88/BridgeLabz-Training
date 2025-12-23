//Java program to count vowels and consonants.
import java.util.Scanner;

public class VowelConsonantCount {

    // User-defined method to count vowels and consonants
    public static void countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;
        // Convert string to lowercase for easy comparison
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if character is an alphabet
            if (ch >= 'a' && ch <= 'z') {
                // Check for vowels
                if (ch == 'a' || ch == 'e' || ch == 'i' || 
                    ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        // Display result
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        // Call method
        countVowelsAndConsonants(input);

        sc.close();
    }
}
