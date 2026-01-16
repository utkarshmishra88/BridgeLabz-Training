package com.sorting.eventmanager;
import java.util.Scanner;

public class EventManager {

    // Swap utility
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Partition method (same logic as your code)
    public static int partition(int[] arr, int lo, int hi) {

        int pivot = arr[lo];
        int pivotIdx = lo;
        int smallerCount = 0;

        // count elements <= pivot
        for (int i = lo + 1; i <= hi; i++) {
            if (arr[i] <= pivot)
                smallerCount++;
        }

        int correctIdx = pivotIdx + smallerCount;
        swap(arr, pivotIdx, correctIdx);

        // rearrange elements around pivot
        int i = lo, j = hi;

        while (i < correctIdx && j > correctIdx) {
            if (arr[i] <= pivot) {
                i++;
            } else if (arr[j] > pivot) {
                j--;
            } else {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return correctIdx;
    }

    // Quick Sort
    public static void quickSort(int[] arr, int lo, int hi) {
        if (lo >= hi)
            return;

        int idx = partition(arr, lo, hi);
        quickSort(arr, lo, idx - 1);
        quickSort(arr, idx + 1, hi);
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tickets: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter ticket price: ");
            prices[i] = sc.nextInt();
        }

        quickSort(prices, 0, n - 1);

        System.out.println("\nSorted Ticket Prices (Low → High):");
        for (int price : prices) {
            System.out.print(price + " ");
        }

        sc.close();
    }
}
