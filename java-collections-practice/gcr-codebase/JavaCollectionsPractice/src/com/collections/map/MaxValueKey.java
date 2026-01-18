package com.collections.map;
import java.util.*;

public class MaxValueKey {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        // find max value key
        for (String key : map.keySet()) {
            int value = map.get(key);
            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            }
        }

        System.out.println(maxKey);
    }
}
