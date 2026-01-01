package com.encapsulationandpolymorphism.hospitalmanagement;
class OutPatient extends Patient {

    private double consultationFee;

    public OutPatient(int patientId, String name, int age, String diagnosis,
                      double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }
}
