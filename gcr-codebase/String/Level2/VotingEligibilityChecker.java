// Java program to check voting eligibility of students

import java.util.Scanner;

public class VotingEligibilityChecker {

    // constant for number of students
    private static final int STUDENT_COUNT = 10;

    // method to generate age array (2-digit ages)
    public static int[] generateAges(int n) {

        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            // generate random 2-digit age (10 to 99)
            ages[i] = (int) (Math.random() * 90) + 10;
        }

        return ages;
    }

    // method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            int age = ages[i];
            result[i][0] = String.valueOf(age);

            if (age < 0) {
                result[i][1] = "false";
            } else if (age >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    // method to display result in tabular format
    public static void displayResult(String[][] data) {

        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        // generate random ages for students
        int[] ages = generateAges(STUDENT_COUNT);

        // check voting eligibility
        String[][] votingResult = checkVotingEligibility(ages);

        // display result
        displayResult(votingResult);
    }
}
