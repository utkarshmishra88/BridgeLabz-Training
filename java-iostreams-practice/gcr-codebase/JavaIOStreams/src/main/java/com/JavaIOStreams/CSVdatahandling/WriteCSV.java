package com.JavaIOStreams.CSVdatahandling;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
    public static void main(String[] args) {
        String file = "C:\\\\Users\\\\dell\\\\Desktop\\\\Java-programming-workspace\\\\java-iostreams-practice\\\\gcr-codebase\\\\JavaIOStreams\\\\src\\\\main\\\\java\\\\com\\\\JavaIOStreams\\\\CSVdatahandling\\\\employees.csv";

        try (FileWriter writer = new FileWriter(file)) {

            writer.append("ID,Name,Department,Salary\n");

            writer.append("101,Utkarsh,IT,55000\n");
            writer.append("102,Vikash,HR,48000\n");
            writer.append("103,Aman,Finance,62000\n");
            writer.append("104,Rahul,Marketing,50000\n");
            writer.append("105,Neha,Development,70000\n");

            System.out.println("CSV file created successfully");

        } catch (IOException e) {
            System.out.println("Error writing CSV file");
        }
    }
}
