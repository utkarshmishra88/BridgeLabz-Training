package com.sorting.medwarehouse;
import java.util.Scanner;

public class MedWarehouseMergeSort {

    static void mergeSort(Medicine[] arr, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    static void merge(Medicine[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Medicine[] L = new Medicine[n1];
        Medicine[] R = new Medicine[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i].expiry <= R[j].expiry)
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    static void display(Medicine[] arr) {
        for (Medicine m : arr) {
            System.out.println(m.name + " - Expiry in " + m.expiry + " days");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of medicines: ");
        int n = sc.nextInt();

        Medicine[] medicines = new Medicine[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter medicine name: ");
            String name = sc.next();
            System.out.print("Enter expiry (days): ");
            int expiry = sc.nextInt();
            medicines[i] = new Medicine(name, expiry);
        }

        mergeSort(medicines, 0, n - 1);

        System.out.println("\nSorted Medicines by Expiry:");
        display(medicines);
    }
}