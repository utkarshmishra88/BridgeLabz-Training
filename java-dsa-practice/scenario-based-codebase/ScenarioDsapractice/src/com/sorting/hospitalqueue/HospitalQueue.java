package com.sorting.hospitalqueue;
import java.util.Scanner;

public class HospitalQueue {

    // Bubble Sort based on criticality(descending)
    static void bubbleSort(Patient[] patients) {
        int n = patients.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (patients[j].criticality < patients[j + 1].criticality) {

                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();

        Patient[] patients = new Patient[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for patient " + (i + 1));
            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Criticality (1-10): ");
            int criticality = sc.nextInt();

            patients[i] = new Patient(name, criticality);
        }

        bubbleSort(patients);

        System.out.println("\nPatients sorted by criticality (High → Low):");
        for (Patient p : patients) {
            System.out.println(p.name + " - " + p.criticality);
        }

        sc.close();
    }
}
