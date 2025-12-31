package com.objectmodelling;

import java.util.ArrayList;

class Doctor {
    private int doctorId;
    private String name;
    private ArrayList<Patient> patients = new ArrayList<>();

    public Doctor(int doctorId, String name) {
        this.doctorId = doctorId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Communication method
    public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this); // two-way association

        System.out.println("Dr. " + name + " is consulting patient " + patient.getName());
    }

    public void viewPatients() {
        System.out.println("Dr. " + name + " consulted:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}

