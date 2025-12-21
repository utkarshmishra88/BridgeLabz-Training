// Java program to check whether students are eligible to vote based on their age.
import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check whether a student can vote or not
    public boolean canStudentVote(int age){
        if(age < 0)
            return false;
        else if(age >= 18)
            return true;
        else
            return false;
    }

    // Main method
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        StudentVoteChecker checker = new StudentVoteChecker();
        for(int i = 0; i < ages.length; i++){
            ages[i] = sc.nextInt();
            if(checker.canStudentVote(ages[i]))
                System.out.println("Student " + (i + 1) + " can vote");
            else
                System.out.println("Student " + (i + 1) + " cannot vote");
        }

        sc.close();
    }
}
