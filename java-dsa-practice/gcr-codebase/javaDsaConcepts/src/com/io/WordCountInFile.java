package com.io;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class WordCountInFile {
    public static void main(String[] args) {

        String filePath = "src/com/io/sample.txt";   // file to read
        String targetWord = "Java";       // word to count
        int count = 0;

        try {
            // Step 1: Create FileReader
            FileReader fr = new FileReader(filePath);

            // Step 2: Wrap with BufferedReader
            BufferedReader br = new BufferedReader(fr);

            String line;

            // Step 3: Read file line by line
            while ((line = br.readLine()) != null) {

                // Convert line to lowercase for case-insensitive comparison
                String[] words = line.toLowerCase().split("\\s+");

                // Step 4: Count word occurrences
                for (String word : words) {
                    if (word.equals(targetWord.toLowerCase())) {
                        count++;
                    }
                }
            }

            // Step 5: Close the file
            br.close();

            // Step 6: Print result
            System.out.println("Occurrences of \"" + targetWord + "\": " + count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
