package com.sorting;
import java.util.Scanner;

public class QuickSortProductPrices {

    // swap function
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // partition method (same logic as your code)
    public static int partition(int[] arr, int lo, int hi) {

        int pivot = arr[lo];
        int pivotIdx = lo;
        int smallerCount = 0;

        // count elements <= pivot
        for (int i = lo + 1; i <= hi; i++) {
            if (arr[i] <= pivot) {
                smallerCount++;
            }
        }

        // place pivot at correct position
        int correctIdx = pivotIdx + smallerCount;
        swap(arr, pivotIdx, correctIdx);

        // rearrange elements
        int i = lo, j = hi;
        while (i < correctIdx && j > correctIdx) {

            if (arr[i] <= pivot) {
                i++;
            } else if (arr[j] > pivot) {
                j--;
            } else {
                swap(arr, i, j);
            }
        }

        return correctIdx;
    }

    // quick sort method
    public static void quickSort(int[] arr, int lo, int hi) {
        if (lo >= hi) return;

        int idx = partition(arr, lo, hi);
        quickSort(arr, lo, idx - 1);
        quickSort(arr, idx + 1, hi);
    }

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter product prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        quickSort(prices, 0, n - 1);

        System.out.println("Sorted Product Prices (Ascending Order):");
        for (int price : prices) {
            System.out.print(price + " ");
        }

        sc.close();
    }
}

