package com.JavaIOStreams.JSON.handsonpracticeproblem;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;

public class CsvToJson {

    public static void main(String[] args) {

        String csvFile = "students.csv";
        JSONArray jsonArray = new JSONArray();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            String line;
            String[] headers = br.readLine().split(",");

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                JSONObject obj = new JSONObject();
                for (int i = 0; i < headers.length; i++) {
                    obj.put(headers[i], values[i]);
                }
                jsonArray.put(obj);
            }

            System.out.println(jsonArray.toString(4));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}