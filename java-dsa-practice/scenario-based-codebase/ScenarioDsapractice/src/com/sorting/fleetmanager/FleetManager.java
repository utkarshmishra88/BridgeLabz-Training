package com.sorting.fleetmanager;
import java.util.*;

public class FleetManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter vehicle id and mileage: ");
            vehicles.add(new Vehicle(sc.next(), sc.nextInt()));
        }

        mergeSort(vehicles, 0, vehicles.size() - 1);

        // final master schedule
        for (Vehicle v : vehicles)
            System.out.println(v.id + " " + v.mileage);
    }

    // merge sort
    static void mergeSort(List<Vehicle> list, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(list, left, mid);
            mergeSort(list, mid + 1, right);
            merge(list, left, mid, right);
        }
    }

    // merge two sorted lists
    static void merge(List<Vehicle> list, int l, int m, int r) {
        List<Vehicle> temp = new ArrayList<>();
        int i = l, j = m + 1;

        while (i <= m && j <= r) {
            if (list.get(i).mileage <= list.get(j).mileage)
                temp.add(list.get(i++));
            else
                temp.add(list.get(j++));
        }

        while (i <= m) temp.add(list.get(i++));
        while (j <= r) temp.add(list.get(j++));

        for (int k = 0; k < temp.size(); k++)
            list.set(l + k, temp.get(k));
    }
}