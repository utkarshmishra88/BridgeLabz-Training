// Java program to divide chocolates among children and find quotient and remainder.
import java.util.Scanner;

public class ChocolateDistribution {

    // Method to find chocolates per child and remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    // Main method
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int numberOfChocolates = sc.nextInt();
        int numberOfChildren = sc.nextInt();
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        System.out.println("Each child gets " + result[0] + " chocolates");
        System.out.println("Remaining chocolates = " + result[1]);

        sc.close();
    }
}
