package com.JavaIOStreams.JSON.handsonpracticeproblem;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONObject;

public class ReadJsonFile {
    public static void main(String[] args) throws Exception {

        String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\dell\\Desktop\\Java-programming-workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStreams\\src\\main\\java\\com\\JavaIOStreams\\JSON\\handsonpracticeproblem\\data.json"
        		+ "")));

        JSONObject json = new JSONObject(content);

        for(String key : json.keySet()){
            System.out.println(key + " : " + json.get(key));
        }
    }
}
