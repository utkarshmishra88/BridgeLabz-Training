package com.sorting.robowarehouse;
import java.util.Scanner;

public class RoboWarehouse {

    // Insertion Sort (Ascending by weight)
    public static void insertionSort(PackageItem[] packages) {

        for (int i = 1; i < packages.length; i++) {
            PackageItem key = packages[i]; // single temporary variable
            int j = i - 1;
            // Shift heavier packages to the right
            while (j >= 0 && packages[j].weight > key.weight) {
                packages[j + 1] = packages[j];
                j--;
            }
            // Insert at correct position
            packages[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of packages: ");
        int n = sc.nextInt();
        PackageItem[] packages = new PackageItem[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter package weight: ");
            packages[i] = new PackageItem(sc.nextInt());
        }

        insertionSort(packages);
        System.out.println("\nShelf Order (Ascending Weight):");
        for (PackageItem p : packages) {
            System.out.print(p.weight + " ");
        }

        sc.close();
    }
}