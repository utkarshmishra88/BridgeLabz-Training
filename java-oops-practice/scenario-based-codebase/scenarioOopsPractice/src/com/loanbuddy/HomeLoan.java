package com.loanbuddy;
// Home Loan
class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, int term) {
        super(applicant, term, 7.5);
    }

    @Override
    public boolean approveLoan() {
        boolean status = applicant.getCreditScore() >= 700 &&
                         applicant.getIncome() >= 40000;
        setApproved(status);
        return status;
    }
}