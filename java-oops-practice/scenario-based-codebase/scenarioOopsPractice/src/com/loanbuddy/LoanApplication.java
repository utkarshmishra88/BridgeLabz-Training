package com.loanbuddy;
// Base Loan class
abstract class LoanApplication implements IApprovable {
    protected Applicant applicant;
    protected int term;                 // months
    protected double interestRate;       // annual
    private boolean approved;            // restricted access

    public LoanApplication(Applicant applicant, int term, double interestRate) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
    }

    protected void setApproved(boolean status) {
        this.approved = status;
    }

    public boolean isApproved() {
        return approved;
    }

    // EMI formula
    public double calculateEMI() {
        double P = applicant.getLoanAmount();
        double R = interestRate / (12 * 100);
        int N = term;

        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }
}