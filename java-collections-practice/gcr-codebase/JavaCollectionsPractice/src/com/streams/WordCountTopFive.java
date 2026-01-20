package com.streams;
import java.io.*;
import java.util.*;

public class WordCountTopFive {
    public static void main(String[] args) {

        String fileName = "input.txt";
        Map<String, Integer> wordCount = new HashMap<>();
        int totalWords = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        totalWords++;
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sort words by frequency (descending)
        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("Total Words: " + totalWords);
        System.out.println("Top 5 Most Frequent Words:");

        for (int i = 0; i < Math.min(5, list.size()); i++) {
            System.out.println(list.get(i).getKey() + " : " + list.get(i).getValue());
        }
    }
}
