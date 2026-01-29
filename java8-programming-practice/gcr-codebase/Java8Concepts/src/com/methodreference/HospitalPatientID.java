package com.methodreference;
import java.util.Arrays;
import java.util.List;

public class HospitalPatientID{

    // Static method to print patient ID
    public static void printPatientId(String id){
        System.out.println("Patient ID: " + id);
    }

    public static void main(String[] args){

        List<String> patientIds = Arrays.asList(
                "HOSP-P001",
                "HOSP-P002",
                "HOSP-P003",
                "HOSP-P004");

        // Method reference instead of lambda
        patientIds.forEach(HospitalPatientID::printPatientId);
    }
}
