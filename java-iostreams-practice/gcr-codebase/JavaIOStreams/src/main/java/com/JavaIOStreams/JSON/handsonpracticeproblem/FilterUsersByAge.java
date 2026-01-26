package com.JavaIOStreams.JSON.handsonpracticeproblem;
import org.json.JSONArray;
import org.json.JSONObject;

public class FilterUsersByAge {
    public static void main(String[] args) {

        String jsonData = """
        [
          {"name":"Utkarsh","age":22},
          {"name":"Vikash","age":28},
          {"name":"Amit","age":30},
          {"name":"Rahul","age":24}
        ]
        """;

        JSONArray users = new JSONArray(jsonData);

        for(int i = 0; i < users.length(); i++){
            JSONObject user = users.getJSONObject(i);
            if(user.getInt("age") > 25){
                System.out.println(user);
            }
        }
    }
}
