// program for student grade calulator

import java.util.Scanner;

public class StudentGradeCalculator {

    // constant for number of subjects
    private static final int SUBJECTS = 3;

    // generate random 2-digit scores for PCM
    public static int[][] generateRandomScores(int students) {

        int[][] scores = new int[students][SUBJECTS];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < SUBJECTS; j++) {
                scores[i][j] = (int) (Math.random() * 51) + 50; // 50–100
            }
        }
        return scores;
    }

    //  calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {

        int students = scores.length;
        double[][] result = new double[students][3];

        for (int i = 0; i < students; i++) {

            int total = 0;
            for (int j = 0; j < SUBJECTS; j++) {
                total += scores[i][j];
            }

            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // round to 2 digits
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    //  calculate grade based on percentage
    public static String[] calculateGrades(double[][] results) {

        int students = results.length;
        String[] grades = new String[students];

        for (int i = 0; i < students; i++) {

            double percent = results[i][2];

            if (percent >= 80)
                grades[i] = "A";
            else if (percent >= 70)
                grades[i] = "B";
            else if (percent >= 60)
                grades[i] = "C";
            else if (percent >= 50)
                grades[i] = "D";
            else if (percent >= 40)
                grades[i] = "E";
            else
                grades[i] = "R";
        }
        return grades;
    }

    // display scorecard
    public static void displayScoreCard(int[][] scores, double[][] results, String[] grades) {

        System.out.println("\n--------------- STUDENT SCORECARD ---------------");
        System.out.println("Stu  Phy  Chem  Math  Total  Avg     %age   Grade");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-4d %-4d %-5d %-5d %-6.0f %-7.2f %-7.2f %-5s%n",
                    (i + 1),
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    grades[i]);
        }
    }

    public static void main(String[] args) {
         //create scanner object 

        Scanner input = new Scanner(System.in);
         
        //take input from users
        System.out.print("Enter number of students: ");
        int students = input.nextInt();
      
         
        
        int[][] scores = generateRandomScores(students);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);

        displayScoreCard(scores, results, grades);
         
        //close the scanner
        input.close();
    }
}
