package com.JavaIOStreams.CSVdatahandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateCSV {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\dell\\Desktop\\Java-programming-workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStreams\\src\\main\\java\\com\\JavaIOStreams\\CSVdatahandling\\employees.csv";
        String outputFile = "C:\\Users\\dell\\Desktop\\Java-programming-workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStreams\\src\\main\\java\\com\\JavaIOStreams\\CSVdatahandling\\employees_updated.csv";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             FileWriter writer = new FileWriter(outputFile)) {

            writer.write(br.readLine() + "\n"); // write header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                if (department.equalsIgnoreCase("IT")) {
                    salary = salary * 1.10;
                }

                writer.write(
                        data[0] + "," +
                        data[1] + "," +
                        department + "," +
                        String.format("%.2f", salary) + "\n"
                );
            }

            System.out.println("Updated CSV file created successfully");

        } catch (IOException e) {
            System.out.println("Error processing CSV file");
        }
    }
}
