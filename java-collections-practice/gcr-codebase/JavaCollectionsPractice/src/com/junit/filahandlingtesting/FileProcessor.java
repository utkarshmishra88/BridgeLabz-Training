package com.junit.filahandlingtesting;
import java.io.*;

public class FileProcessor {

    public void writeToFile(String filename, String content) throws IOException {
        FileWriter writer = new FileWriter(filename);
        writer.write(content);
        writer.close();
    }

    public String readFromFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        StringBuilder data = new StringBuilder();

        while ((line = reader.readLine()) != null) {
            data.append(line);
        }

        reader.close();
        return data.toString();
    }
}
