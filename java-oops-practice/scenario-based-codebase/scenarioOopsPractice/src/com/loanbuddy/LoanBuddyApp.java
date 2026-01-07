package com.loanbuddy;
import java.util.Scanner;
// Main Class
public class LoanBuddyApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter Monthly Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Loan Amount: ");
        double loanAmount = sc.nextDouble();

        System.out.print("Enter Loan Term (months): ");
        int term = sc.nextInt();

        System.out.print("Choose Loan Type (1-Home, 2-Auto): ");
        int choice = sc.nextInt();

        Applicant applicant =
                new Applicant(name, creditScore, income, loanAmount);

        LoanApplication loan;

        if (choice == 1) {
            loan = new HomeLoan(applicant, term);
        } else {
            loan = new AutoLoan(applicant, term);
        }

        if (loan.approveLoan()) {
            System.out.println("\nLoan Approved ");
            System.out.println("Applicant: " + applicant.getName());
            System.out.println("Monthly EMI: " + loan.calculateEMI());
        } else {
            System.out.println("\nLoan Rejected ");
        }

        sc.close();
    }
}