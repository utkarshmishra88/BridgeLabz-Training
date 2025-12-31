package com.objectmodelling;

import java.util.ArrayList;

class Patient {
    private int patientId;
    private String name;
    private ArrayList<Doctor> doctors = new ArrayList<>();

    public Patient(int patientId, String name) {
        this.patientId = patientId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void viewDoctors() {
        System.out.println("Patient: " + name + " consulted:");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getName());
        }
    }
}
