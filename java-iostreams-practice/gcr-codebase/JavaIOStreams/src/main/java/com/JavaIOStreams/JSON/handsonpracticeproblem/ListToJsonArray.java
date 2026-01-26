package com.JavaIOStreams.JSON.handsonpracticeproblem;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

class Student {
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}

public class ListToJsonArray {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Utkarsh"));
        list.add(new Student(2, "Vikash"));

        JSONArray jsonArray = new JSONArray();

        for(Student s : list){
            JSONObject obj = new JSONObject();
            obj.put("id", s.id);
            obj.put("name", s.name);
            jsonArray.put(obj);
        }

        System.out.println(jsonArray.toString(2));
    }
}
