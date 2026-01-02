package com.hospitalmgmtsystem;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String medicalHistory; // sensitive

    protected Doctor doctor;

    // Normal admission
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Emergency admission (overloaded constructor)
    public Patient(int patientId, String name, int age, String medicalHistory) {
        this(patientId, name, age);
        this.medicalHistory = medicalHistory;
    }

    public void assignDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getSummary() {
        return "Patient ID: " + patientId +
               ", Name: " + name +
               ", Age: " + age;
    }

    public abstract void displayInfo(); // polymorphism
}
