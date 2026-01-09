package com.io;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadFileLineByLine {
    public static void main(String[] args) {

        try {
            // Step 1: Create FileReader object
            FileReader fileReader = new FileReader("src/com/io/sample.txt");

            // Step 2: Wrap FileReader with BufferedReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Step 3: Read file line by line
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Step 4: Close the file
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
