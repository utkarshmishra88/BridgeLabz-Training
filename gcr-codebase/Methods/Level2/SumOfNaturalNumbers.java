// Java program to find the sum of n natural numbers using recursion
// and compare it with the result obtained using the formula.
import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to find sum using recursion
    public static int recursiveSum(int n){
        if(n == 0)
            return 0;
        return n + recursiveSum(n - 1);
    }

    // Method to find sum using formula n*(n+1)/2
    public static int formulaSum(int n){
        return (n * (n + 1)) / 2;
    }

    // Main method
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0){
            int sumByRecursion = recursiveSum(n);
            int sumByFormula = formulaSum(n);

            System.out.println("Sum using recursion = " + sumByRecursion);
            System.out.println("Sum using formula = " + sumByFormula);

            if(sumByRecursion == sumByFormula)
                System.out.println("Both results are correct and equal");
            else
                System.out.println("Results are not equal");
        }else{
            System.out.println("Please enter a natural number");
        }

        sc.close();
    }
}
