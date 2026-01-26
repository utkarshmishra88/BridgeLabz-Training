package com.JavaIOStreams.CSVdatahandling;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;

public class JsonToCsv {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\dell\\Desktop\\Java-programming-workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStreams\\src\\main\\java\\com\\JavaIOStreams\\CSVdatahandling\\students.json"));
        StringBuilder jsonData = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            jsonData.append(line);
        }
        br.close();

        JSONArray array = new JSONArray(jsonData.toString());
        FileWriter writer = new FileWriter("C:\\Users\\dell\\Desktop\\Java-programming-workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStreams\\src\\main\\java\\com\\JavaIOStreams\\CSVdatahandling\\student.csv");

        // Header
        writer.write("ID,Name,Age,Marks\n");

        // Data
        for (int i = 0; i < array.length(); i++) {
            JSONObject obj = array.getJSONObject(i);
            writer.write(
                    obj.getInt("id") + "," +
                    obj.getString("name") + "," +
                    obj.getInt("age") + "," +
                    obj.getInt("marks") + "\n"
            );
        }

        writer.close();
        System.out.println("JSON converted to CSV successfully");
    }
}
