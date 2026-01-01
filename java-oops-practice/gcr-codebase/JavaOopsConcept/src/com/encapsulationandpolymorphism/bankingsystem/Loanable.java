package com.encapsulationandpolymorphism.bankingsystem;

interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}
