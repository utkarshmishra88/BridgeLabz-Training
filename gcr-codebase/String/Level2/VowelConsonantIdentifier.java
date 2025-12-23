// Java program to identify Vowel, Consonant, or Not a Letter for each character

import java.util.Scanner;

public class VowelConsonantIdentifier {

    // method to check character type
    public static String checkCharacterType(char ch) {

        // convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // check if alphabet
        if (ch >= 'a' && ch <= 'z') {

            // check vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }

        } else {
            return "Not a Letter";
        }
    }

    // method to analyze string and return 2D array
    public static String[][] analyzeString(String text) {

        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }

        return result;
    }

    // method to display 2D array in tabular format
    public static void displayResult(String[][] data) {

        System.out.println("\nCharacter\tType");
        System.out.println("------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // analyze string
        String[][] result = analyzeString(text);

        // display result
        displayResult(result);

        // close scanner
        input.close();
    }
}
