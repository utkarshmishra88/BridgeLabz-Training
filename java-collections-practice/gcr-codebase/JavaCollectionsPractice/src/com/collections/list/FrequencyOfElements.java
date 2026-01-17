package com.collections.list;
import java.util.*;

public class FrequencyOfElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        List<String> list = new ArrayList<>();
        Map<String, Integer> frequencyMap = new HashMap<>();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            String item = sc.nextLine();
            list.add(item);

            // count frequency
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        System.out.println("Input List: " + list);
        System.out.println("Frequency Map: " + frequencyMap);

        sc.close();
    }
}
