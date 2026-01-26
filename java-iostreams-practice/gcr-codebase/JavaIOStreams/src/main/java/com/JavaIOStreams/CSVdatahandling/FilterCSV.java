package com.JavaIOStreams.CSVdatahandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterCSV {
    public static void main(String[] args) {
        String file = "C:\\Users\\dell\\Desktop\\Java-programming-workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStreams\\src\\main\\java\\com\\JavaIOStreams\\CSVdatahandling\\student.csv";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int marks = Integer.parseInt(data[3]);

                if (marks > 80) {
                    System.out.println(
                        "ID: " + data[0] +
                        ", Name: " + data[1] +
                        ", Age: " + data[2] +
                        ", Marks: " + marks
                    );
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
        }
    }
}
