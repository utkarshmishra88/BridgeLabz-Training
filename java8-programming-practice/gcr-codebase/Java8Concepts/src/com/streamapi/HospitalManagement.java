package com.streamapi;
import java.util.*;

class Doctor{

    private String name;
    private String specialty;
    private boolean weekendAvailable;

    public Doctor(String name, String specialty, boolean weekendAvailable) {
        this.name = name;
        this.specialty = specialty;
        this.weekendAvailable = weekendAvailable;
    }

    public boolean isWeekendAvailable() {
        return weekendAvailable;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public String toString() {
        return name + " - " + specialty;
    }
}

public class HospitalManagement{

    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Amit", "Cardiology", true),
            new Doctor("Dr. Neha", "Dermatology", false),
            new Doctor("Dr. Raj", "Neurology", true),
            new Doctor("Dr. Priya", "Orthopedics", true),
            new Doctor("Dr. Karan", "Anesthesiology", false));

        doctors.stream()
               .filter(Doctor::isWeekendAvailable)
               .sorted(Comparator.comparing(Doctor::getSpecialty))
               .forEach(System.out::println);
    }
}
