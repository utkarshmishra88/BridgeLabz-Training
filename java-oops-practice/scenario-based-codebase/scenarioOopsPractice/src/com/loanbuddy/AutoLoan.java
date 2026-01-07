package com.loanbuddy;
// Auto Loan
class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int term) {
        super(applicant, term, 9.0);
    }

    @Override
    public boolean approveLoan() {
        boolean status = applicant.getCreditScore() >= 650;
        setApproved(status);
        return status;
    }
}