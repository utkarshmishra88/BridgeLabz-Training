// Java program to remove all occurrences of a specific character from a string
import java.util.Scanner;

public class RemoveSpecificCharacter {

    // Method to remove a specific character
    public static String removeCharacter(String str, char removeChar) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != removeChar) {
                result = result + str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
		// Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        // Display the result
        String output = removeCharacter(input, ch);
        System.out.println("Modified String: \"" + output + "\"");
        
		// Closing scanner stream
        sc.close();
    }
}
