package com.hashmap;

import java.util.*;

public class PairWithGivenSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            int needed = target - arr[i];

            if (map.containsKey(needed)) {
                System.out.println("Pair found: " + needed + " + " + arr[i] + " = " + target);
                found = true;
                break;
            }
            map.put(arr[i], i);
        }

        if (!found) {
            System.out.println("No pair found");
        }
    }
}
