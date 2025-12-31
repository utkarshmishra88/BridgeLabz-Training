package com.objectmodelling;

import java.util.ArrayList;

class Hospital {
    private String hospitalName;
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Patient> patients = new ArrayList<>();

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showHospitalData() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors: " + doctors.size());
        System.out.println("Patients: " + patients.size());
    }
}

