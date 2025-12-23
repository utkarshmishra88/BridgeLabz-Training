// Java program that takes a sentence as input and returns the longest word
import java.util.Scanner;

public class LongestWordInSentence {

    // Method to find the longest word
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        
		// Displaying the result
        String longest = findLongestWord(input);
        System.out.println("Longest word: " + longest);
        
		// Closing scanner stream
        sc.close();
    }
}
