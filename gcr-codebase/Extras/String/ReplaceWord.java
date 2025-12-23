// Program to replace a word with another
import java.util.Scanner;

public class ReplaceWord {

    // User-defined replace method
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) {
                result = result + newWord;
            } else {
                result = result + words[i];
            }

            if (i < words.length - 1) {
                result = result + " ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input		
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter word to replace: ");
        String oldWord = sc.next();
		System.out.print("Enter new word: ");
        String newWord = sc.next();
        
		// Display the result
        String output = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified sentence: " + output);
        
		// Closing scanner stream
        sc.close();
    }
}
