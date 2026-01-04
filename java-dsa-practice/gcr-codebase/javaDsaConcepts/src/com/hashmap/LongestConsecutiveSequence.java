package com.hashmap;
import java.util.*;

public class LongestConsecutiveSequence {

    // Method to find longest consecutive sequence length
    public static int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        // Add all elements to set
        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;

        // Check for consecutive sequence
        for (int num : set) {
            // Start only if it's the beginning of a sequence
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }
        return longest;
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

        int result = longestConsecutive(arr);
        System.out.println("Longest consecutive sequence length: " + result);
    }
}
