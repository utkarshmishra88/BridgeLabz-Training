package com.stacksandqueues;
import java.util.*;

public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] arr, int k) {
        if (arr == null || k <= 0) return new int[0];

        int n = arr.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Remove elements out of current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            // Remove smaller elements (not useful)
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }
            // Add current index
            deque.offerLast(i);
            // Store max for window
            if (i >= k - 1) {
                result[i - k + 1] = arr[deque.peekFirst()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] res = maxSlidingWindow(arr, k);
        System.out.println(Arrays.toString(res));
    }
}

