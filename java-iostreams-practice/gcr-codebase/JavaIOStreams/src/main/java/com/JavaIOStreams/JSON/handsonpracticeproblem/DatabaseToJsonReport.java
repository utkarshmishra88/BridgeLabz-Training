package com.JavaIOStreams.JSON.handsonpracticeproblem;

import org.json.JSONArray;
import org.json.JSONObject;

import java.sql.*;

public class DatabaseToJsonReport {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "root";

        JSONArray report = new JSONArray();

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                JSONObject student = new JSONObject();
                student.put("id", rs.getInt("id"));
                student.put("name", rs.getString("name"));
                student.put("age", rs.getInt("age"));
                student.put("course", rs.getString("course"));

                report.put(student);
            }

            System.out.println(report.toString(4));

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
