package com.hospitalmgmtsystem;

class InPatient extends Patient {
    private int daysAdmitted;

    public InPatient(int id, String name, int age, int daysAdmitted) {
        super(id, name, age);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public void displayInfo() {
        System.out.println(getSummary() +
                ", Type: InPatient, Days: " + daysAdmitted);
    }

    public int getDaysAdmitted() {
        return daysAdmitted;
    }
}
