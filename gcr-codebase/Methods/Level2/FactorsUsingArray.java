// Java program to find factors of a number and calculate their sum, product and sum of squares.
import java.util.Scanner;

public class FactorsUsingArray {

    // Method to find and return in an array
    public static int[] findFactors(int number){

        int count = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0)
                count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    // Method to calculate sum of factors
    public static int findSum(int[] factors){
        int sum = 0;
        for(int i = 0; i < factors.length; i++){
            sum += factors[i];
		}
        return sum;
    }

    // Method to calculate product of factors
    public static long findProduct(int[] factors){
        long product = 1;
        for(int i = 0; i < factors.length; i++){
            product *= factors[i];
        }
        return product;
    }

    // Method to calculate sum of squares of factors
    public static double findSumOfSquares(int[] factors){
        double sumSq = 0;
        for(int i = 0; i < factors.length; i++){
            sumSq += Math.pow(factors[i], 2);
        }
        return sumSq;
    }

    // Main method
    public static void main(String args[]){
	
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] factors = findFactors(number);
        for(int i = 0; i < factors.length; i++){
            System.out.print(factors[i] + " ");
        }
        System.out.println();
        System.out.println("Sum = " + findSum(factors));
        System.out.println("Product = " + findProduct(factors));
        System.out.println("Sum of Squares = " + findSumOfSquares(factors));

        sc.close();
    }
}
