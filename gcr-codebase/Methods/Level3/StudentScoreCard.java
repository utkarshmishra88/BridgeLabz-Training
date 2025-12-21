// Java program to generate PCM marks, calculate total, average, percentage and display scorecard.
import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random 2-digit PCM scores for students
    public static int[][] generatePCMScores(int students){
        int[][] scores = new int[students][3];
        for(int i = 0; i < students; i++){
            for(int j = 0; j < 3; j++){
                scores[i][j] = (int)(Math.random() * 90) + 10;
            }
        }
        return scores;
    }

    // Method to calculate total, average and percentage
    public static double[][] calculateResults(int[][] scores){
        double[][] result = new double[scores.length][3];
        for(int i = 0; i < scores.length; i++){
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Method to display the scorecard
    public static void displayScoreCard(int[][] scores, double[][] result){
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\tPercent");
        for(int i = 0; i < scores.length; i++){
            System.out.println((i + 1) + "\t" +scores[i][0] + "\t" +scores[i][1] + "\t" +scores[i][2] + "\t" +(int)result[i][0] + "\t" +result[i][1] + "\t" +result[i][2]);
        }
    }

    // Main method
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int[][] scores = generatePCMScores(students);
        double[][] result = calculateResults(scores);
        displayScoreCard(scores, result);

        sc.close();
    }
}
