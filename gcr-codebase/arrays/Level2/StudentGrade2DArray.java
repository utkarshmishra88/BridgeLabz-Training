// Program to calculate percentage and grade using 2D array for marks
import java.util.Scanner;

public class StudentGrade2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input for number of students
        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        // b. Create arrays
        int[][] marks = new int[number][3];
        double[] percentage = new double[number];
        char[] grade = new char[number];

        // c. Take input for marks
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter marks for student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + ": ");
                marks[i][j] = sc.nextInt();
                // If marks are negative, re-enter
                if (marks[i][j] < 0) {
                    System.out.println("Marks must be positive. Please re-enter.");
                    j--;
                }
            }
        }

        // d. Calculate percentage and grade using 2D array
        for (int i = 0; i < number; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        // e. Display marks, percentage, and grade
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics   : " + marks[i][0]);
            System.out.println("Chemistry : " + marks[i][1]);
            System.out.println("Maths     : " + marks[i][2]);
            System.out.printf("Percentage: %.2f%%%n", percentage[i]);
            System.out.println("Grade     : " + grade[i]);
            System.out.println();
        }

        sc.close();
    }
}
