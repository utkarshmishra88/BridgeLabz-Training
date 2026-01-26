package com.JavaIOStreams.JSON.handsonpracticeproblem;
import org.json.JSONObject;
import org.json.XML;

public class JsonToXml {

    public static void main(String[] args) {

        String jsonStr = """
        {
            "student": {
                "name": "Utkarsh",
                "age": 21,
                "course": "Java"
            }
        }
        """;

        JSONObject jsonObject = new JSONObject(jsonStr);

        String xml = XML.toString(jsonObject);

        System.out.println(xml);
    }
}