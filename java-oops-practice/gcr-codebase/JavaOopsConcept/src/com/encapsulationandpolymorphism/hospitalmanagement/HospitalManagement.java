package com.encapsulationandpolymorphism.hospitalmanagement;

public class HospitalManagement {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Amit", 45, "Heart Surgery", 5, 3000);
        Patient p2 = new OutPatient(102, "Neha", 30, "Fever", 500);

        p1.addRecord("ECG Test");
        p1.addRecord("Blood Test");

        p2.addRecord("Temperature Check");

        displayBill(p1);
        displayBill(p2);
    }

    // Polymorphism
    static void displayBill(Patient patient) {
        patient.getPatientDetails();
        System.out.println("Diagnosis  : " + patient.getDiagnosis());
        System.out.println("Total Bill : ₹" + patient.calculateBill());
        patient.viewRecords();
        System.out.println("-----------------------------");
    }
}
