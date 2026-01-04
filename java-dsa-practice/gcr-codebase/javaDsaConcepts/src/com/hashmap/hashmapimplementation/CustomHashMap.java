package com.hashmap.hashmapimplementation;

public class CustomHashMap {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put(1, 10);
        map.put(2, 20);
        map.put(12, 120); // collision with key 2

        System.out.println(map.get(1));   // 10
        System.out.println(map.get(2));   // 20
        System.out.println(map.get(12));  // 120

        map.remove(2);
        System.out.println(map.get(2));   // null
    }
}
