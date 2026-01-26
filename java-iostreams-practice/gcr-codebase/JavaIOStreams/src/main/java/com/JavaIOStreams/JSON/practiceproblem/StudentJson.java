package com.JavaIOStreams.JSON.practiceproblem;
import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJson {

    public static void main(String[] args) {

        JSONObject student = new JSONObject();
        student.put("name", "Utkarsh Mishra");
        student.put("age", 21);

        JSONArray subjects = new JSONArray();
        subjects.put("Java");
        subjects.put("Spring Boot");
        subjects.put("SQL");

        student.put("subjects", subjects);

        System.out.println(student.toString(4));
    }
}