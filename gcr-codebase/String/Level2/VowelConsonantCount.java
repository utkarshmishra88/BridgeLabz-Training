// Java program to find vowels and consonants count in a string

import java.util.Scanner;

public class VowelConsonantCount {

    // method to check character type
    public static String checkCharacterType(char ch) {

        // convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // check if letter
        if (ch >= 'a' && ch <= 'z') {

            // check vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // method to count vowels and consonants
    public static int[] findVowelConsonantCount(String text) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                String result = checkCharacterType(ch);

                if (result.equals("Vowel")) {
                    vowels++;
                } else if (result.equals("Consonant")) {
                    consonants++;
                }
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // get counts
        int[] count = findVowelConsonantCount(text);

        // display result
        System.out.println("\nVowels Count: " + count[0]);
        System.out.println("Consonants Count: " + count[1]);

        // close scanner
        input.close();
    }
}
