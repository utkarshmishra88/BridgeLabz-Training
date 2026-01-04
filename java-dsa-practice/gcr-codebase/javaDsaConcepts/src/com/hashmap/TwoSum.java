package com.hashmap;
import java.util.*;

public class TwoSum {

    // Method to find two indices
    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int needed = target - arr[i];

            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }

            map.put(arr[i], i);
        }
        return new int[]{-1, -1}; // if no pair found
    }

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

        int[] result = twoSum(arr, target);

        if (result[0] == -1) {
            System.out.println("No two sum solution found");
        } else {
            System.out.println("Indices found: " + result[0] + " and " + result[1]);
        }
    }
}

