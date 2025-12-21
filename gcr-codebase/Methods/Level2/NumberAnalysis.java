// Java program to check positive/negative numbers, even/odd for positives,
// and compare the first and last elements of an array.
import java.util.Scanner;

public class NumberAnalysis {

    // Method to check whether a number is positive
    public static boolean isPositive(int number){
        return number >= 0;
    }

    // Method to check whether a number is even
    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2){

        if(number1 > number2)
            return 1;
        else if(number1 == number2)
            return 0;
        else
            return -1;
    }

    // Main method
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
            if(isPositive(numbers[i])){
                if(isEven(numbers[i]))
                    System.out.println("Positive Even");
                else
                    System.out.println("Positive Odd");
            }else{
                System.out.println("Negative");
            }
        }

        int result = compare(numbers[0], numbers[numbers.length - 1]);
        if(result == 1)
            System.out.println("First element is greater than last element");
        else if(result == 0)
            System.out.println("First and last elements are equal");
        else
            System.out.println("First element is less than last element");

        sc.close();
    }
}
