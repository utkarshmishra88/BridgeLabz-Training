// program to check whether a year is a leap year or not using multiple if else

import java.util.Scanner;

public class LeapYearUsingIfElse{
   public static void main(String[]args){
       
       //Initialize variables
         int year;
       
         Scanner input=new Scanner(System.in);
         
      // Take input from users
         System.out.print("\nEnter Year:");
         year=input.nextInt();
         
      // Check valid Gregorian calendar year
         if(year>=1582){
             
             // check leap year conditions using multiple if else
             if(year%400==0){
                 System.out.println("Year is a Leap Year");
             }
             else if(year%100==0){
                 System.out.println("Year is not a Leap Year");
             }
             else if(year%4==0){
                 System.out.println("Year is a Leap Year");
             }else{
                 System.out.println("Year is not a Leap Year");
             }
             
         }else{
             System.out.println("Year should be greater than or equal to 1582");
         }
         // close the scanner
         input.close();
  }
}
