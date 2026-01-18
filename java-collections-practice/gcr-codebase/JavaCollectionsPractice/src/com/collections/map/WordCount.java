package com.collections.map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("src/com/collections/map/input.txt"));

        String line = br.readLine();
        br.close();

        line = line.toLowerCase().replaceAll("[^a-z ]", "");

        String[] words = line.split(" ");
        for (String w : words) {
            if (!w.equals(""))
                map.put(w, map.getOrDefault(w, 0) + 1);
        }

        System.out.println(map);
    }
}
