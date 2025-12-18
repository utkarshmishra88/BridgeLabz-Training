//Program to check if the first is the smallest of the 3 numbers.
import java.util.Scanner;

public class LargestOf3{
  public static void main (String args[]){
   //Create a Scanner Object
   Scanner input = new Scanner(System.in);
   
   //Get input value for number
   System.out.println("Enter three numbers : ");
   int number1=input.nextInt();
   int number2=input.nextInt();
   int number3=input.nextInt();
   
   //Print the result by checking the largest number.
   System.out.println("Is the first number the smallest? "+((number1>number2)&&(number1>number3)));
   System.out.println("Is the second number the smallest? "+((number2>number1)&&(number2>number3)));
   System.out.println("Is the third number the smallest? "+((number3>number1)&&(number3>number2)));
   
   // Closing the Scanner Stream
   input.close();
   
   }
   }