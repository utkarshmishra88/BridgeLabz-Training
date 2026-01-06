package com.searching.binarysearch;
import java.util.Scanner;

public class RotationPoint {

    // Method to find index of smallest element
    static int rotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Binary Search
        while (left < right) {
            int mid = (left + right) / 2;

            // Compare middle with right
            if (arr[mid] > arr[right]) {
                // Smallest element is on right side
                left = mid + 1;
            } else {
                // Smallest element is on left side (or mid)
                right = mid;
            }
        }

        // left == right → rotation point
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array
        System.out.println("Enter rotated sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = rotationPoint(arr);

        System.out.println("Rotation Point Index: " + index);
        System.out.println("Smallest Element: " + arr[index]);

        sc.close();
    }
}
