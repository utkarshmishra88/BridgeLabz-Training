package com.JavaIOStreams.CSVdatahandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MergeCSV {
    public static void main(String[] args) {

        String file1 = "C:\\Users\\dell\\Desktop\\Java-programming-workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStreams\\src\\main\\java\\com\\JavaIOStreams\\CSVdatahandling\\students1.csv";
        String file2 = "C:\\Users\\dell\\Desktop\\Java-programming-workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStreams\\src\\main\\java\\com\\JavaIOStreams\\CSVdatahandling\\students1.csv";
        String output = "C:\\Users\\dell\\Desktop\\Java-programming-workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStreams\\src\\main\\java\\com\\JavaIOStreams\\CSVdatahandling\\students_merged.csv";

        Map<String, String[]> map = new HashMap<>();
        String line;

        // Read students1.csv
        try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                map.put(data[0], new String[]{data[1], data[2]});
            }
        } catch (IOException e) {
            System.out.println("Error reading students1.csv");
            return;
        }

        // Write merged data
        try (BufferedReader br = new BufferedReader(new FileReader(file2));
             FileWriter writer = new FileWriter(output)) {

            writer.write("ID,Name,Age,Marks,Grade\n");
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];

                if (map.containsKey(id)) {
                    String[] s1 = map.get(id);
                    writer.write(
                            id + "," +
                            s1[0] + "," +
                            s1[1] + "," +
                            data[1] + "," +
                            data[2] + "\n"
                    );
                }
            }

            System.out.println("CSV files merged successfully");

        } catch (IOException e) {
            System.out.println("Error merging CSV files");
        }
    }
}
