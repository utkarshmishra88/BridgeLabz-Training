package com.sorting.cropmonitor;
import java.util.Scanner;

public class CropMonitor {

    // Swap utility
    static void swap(SensorData[] arr, int i, int j) {
        SensorData temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Partition based on timestamp
    static int partition(SensorData[] arr, int low, int high) {

        long pivot = arr[high].timestamp; // pivot = last element
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].timestamp <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    // Quick Sort
    static void quickSort(SensorData[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sensor readings: ");
        int n = sc.nextInt();

        SensorData[] data = new SensorData[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter timestamp: ");
            long ts = sc.nextLong();

            System.out.print("Enter temperature: ");
            double temp = sc.nextDouble();

            data[i] = new SensorData(ts, temp);
        }

        quickSort(data, 0, n - 1);

        System.out.println("\nSorted Sensor Data (by timestamp):");
        for (SensorData d : data) {
            System.out.println("Time: " + d.timestamp + "  Temp: " + d.temperature);
        }

        sc.close();
    }
}
