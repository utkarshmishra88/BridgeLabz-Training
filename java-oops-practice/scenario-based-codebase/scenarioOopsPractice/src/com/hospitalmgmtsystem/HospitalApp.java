package com.hospitalmgmtsystem;

public class HospitalApp {
    public static void main(String[] args) {

        Doctor d1 = new Doctor(101, "Dr. Sharma", "Cardiology");

        Patient p1 = new InPatient(1, "Rohit", 45, 5);
        Patient p2 = new OutPatient(2, "Anita", 30);

        p1.assignDoctor(d1);
        p2.assignDoctor(d1);

        p1.displayInfo();
        p2.displayInfo();

        Bill bill = new Bill(5000, 0.18, 500);
        System.out.println("Total Bill Amount: ₹" + bill.calculatePayment());
    }
}
