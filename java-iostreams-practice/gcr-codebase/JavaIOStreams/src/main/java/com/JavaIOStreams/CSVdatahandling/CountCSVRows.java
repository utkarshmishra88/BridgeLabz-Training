package com.JavaIOStreams.CSVdatahandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {
    public static void main(String[] args) {
        String file = "C:\\Users\\dell\\Desktop\\Java-programming-workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStreams\\src\\main\\java\\com\\JavaIOStreams\\CSVdatahandling\\employees.csv";
        int count = 0;
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    count++;
                }
            }

            System.out.println("Total Records: " + count);

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
        }
    }
}
