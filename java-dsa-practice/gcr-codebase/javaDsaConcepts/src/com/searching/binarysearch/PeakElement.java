package com.searching.binarysearch;
import java.util.Scanner;

public class PeakElement {

    static int findPeak(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            boolean leftSide = (mid == 0) || arr[mid] > arr[mid - 1];
            boolean rightSide = (mid == arr.length - 1) || arr[mid] > arr[mid + 1];

            // If mid is higher than both sides, it's a peak
            if (leftSide && rightSide) {
                return mid;
            }

            // If left side is higher, go left
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            // Otherwise go right
            else {
                left = mid + 1;
            }
        }
        return -1; // safety
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peakIndex = findPeak(arr);

        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element value: " + arr[peakIndex]);

        sc.close();
    }
}
