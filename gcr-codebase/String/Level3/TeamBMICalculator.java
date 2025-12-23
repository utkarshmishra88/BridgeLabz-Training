// Java program to calculate BMI and status for a team of 10 members

import java.util.Scanner;

public class TeamBMICalculator {

    // constant for team size
    private static final int TEAM_SIZE = 10;

    // method to calculate BMI and status of each person
    public static String[][] calculateBMIAndStatus(double[][] data) {

        // result array to store height, weight, bmi and status
        String[][] result = new String[TEAM_SIZE][4];

        for (int i = 0; i < TEAM_SIZE; i++) {

            // get weight and height
            double weightKg = data[i][0];
            double heightCm = data[i][1];

            // convert height from cm to meter
            double heightMeter = heightCm / 100.0;

            // calculate BMI
            double bmi = weightKg / (heightMeter * heightMeter);

            // get BMI status
            String status = getBMIStatus(bmi);

            // store values in result array
            result[i][0] = String.format("%.2f", heightCm);
            result[i][1] = String.format("%.2f", weightKg);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }

    // method to determine BMI status
    private static String getBMIStatus(double bmi) {

        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // method to display BMI report in tabular format
    public static void displayBMIReport(String[][] bmiData) {

        System.out.println("\n-------------------- BMI REPORT --------------------");
        System.out.printf("%-10s %-10s %-10s %-15s%n",
                "Height", "Weight", "BMI", "Status");
        System.out.println("----------------------------------------------------");

        for (String[] row : bmiData) {
            System.out.printf("%-10s %-10s %-10s %-15s%n",
                    row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 2D array to store weight and height
        double[][] personData = new double[TEAM_SIZE][2];

        // take input for all team members
        for (int i = 0; i < TEAM_SIZE; i++) {

            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Weight (kg): ");
            personData[i][0] = input.nextDouble();

            System.out.print("Height (cm): ");
            personData[i][1] = input.nextDouble();
        }

        // calculate BMI and status
        String[][] bmiReport = calculateBMIAndStatus(personData);

        // display the result
        displayBMIReport(bmiReport);

        // close scanner
        input.close();
    }
}
