package com.searching.linearsearch;
import java.util.Scanner;

public class SearchWordInSentences {

    // Method to perform Linear Search
    public static String searchSentence(String[] sentences, String word) {

        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence; // first match found
            }
        }

        return "Not Found"; // no match
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of sentences
        System.out.print("Enter number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] sentences = new String[n];

        // Input sentences
        System.out.println("Enter the sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }

        // Input word to search
        System.out.print("Enter the word to search: ");
        String word = sc.nextLine();

        // Call search method
        String result = searchSentence(sentences, word);

        // Output result
        System.out.println("Result: " + result);

        sc.close();
    }
}
