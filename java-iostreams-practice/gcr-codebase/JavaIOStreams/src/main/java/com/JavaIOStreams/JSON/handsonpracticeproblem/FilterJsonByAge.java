package com.JavaIOStreams.JSON.handsonpracticeproblem;
import org.json.JSONArray;
import org.json.JSONObject;

public class FilterJsonByAge {

    public static void main(String[] args) {

        JSONArray users = new JSONArray();

        users.put(new JSONObject().put("name", "Amit").put("age", 22));
        users.put(new JSONObject().put("name", "Rohit").put("age", 28));
        users.put(new JSONObject().put("name", "Utkarsh").put("age", 26));
        users.put(new JSONObject().put("name", "Vikash").put("age", 24));

        System.out.println("Users older than 25:");

        for (int i = 0; i < users.length(); i++) {
            JSONObject user = users.getJSONObject(i);

            if (user.getInt("age") > 25) {
                System.out.println(user.toString(4));
            }
        }
    }
}