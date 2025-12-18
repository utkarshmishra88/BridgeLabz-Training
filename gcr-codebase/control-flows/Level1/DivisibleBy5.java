//Program to check if a number is divisible by 5
import java.util.Scanner;

public class DivisibleBy5{

public static void main (String args[]){
   //Create a Scanner Object
   Scanner input = new Scanner(System.in);
   
   //Get input value for number
   System.out.println("Enter a number : ");
   int number=input.nextInt();
   
   //Print the result by checking the divisibility
   System.out.println("Is the number "+number+" divisible by 5? "+(number%5==0));
   
   // Closing the Scanner Stream
   input.close();
   
   }
   }