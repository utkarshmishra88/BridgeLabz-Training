package com.sorting.hospitalqueue;

class Patient {
    String name;
    int criticality; // 1 (low) to 10 (high)

    Patient(String name, int criticality) {
        this.name = name;
        this.criticality = criticality;
    }
}
