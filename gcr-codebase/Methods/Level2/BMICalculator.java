// Java program to calculate BMI of 10 persons and display height, weight, BMI and status.
import java.util.Scanner;

public class BMICalculator {
    // Method to calculate BMI 
    public static void calculateBMI(double[][] data){
        for(int i = 0; i < data.length; i++){
            double heightInMeters = data[i][1] / 100;
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters);
        }
    }

    // Method to determine BMI status
    public static String[] getBMIStatus(double[][] data){
        String[] status = new String[data.length];
        for(int i = 0; i < data.length; i++){
            double bmi = data[i][2];
            if(bmi <= 18.4)
                status[i] = "Underweight";
            else if(bmi <= 24.9)
                status[i] = "Normal";
            else if(bmi <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }
        return status;
    }

    // Main method
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        for(int i = 0; i < data.length; i++){
            data[i][0] = sc.nextDouble(); // weight
            data[i][1] = sc.nextDouble(); // height
        }
        calculateBMI(data);
        String[] status = getBMIStatus(data);
        for(int i = 0; i < data.length; i++){
            System.out.println("Person " + (i + 1) +
                    " Weight: " + data[i][0] +
                    " Height: " + data[i][1] +
                    " BMI: " + data[i][2] +
                    " Status: " + status[i]);
        }

        sc.close();
    }
}
