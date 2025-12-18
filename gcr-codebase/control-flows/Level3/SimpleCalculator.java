// program to create a calculator using switch case

import java.util.Scanner;

public class SimpleCalculator{
   public static void main(String[]args){
       
       //Initialize variables
         double first;
         double second;
         String op;
       
         Scanner input=new Scanner(System.in);
         
      // Take input from users
         System.out.print("\nEnter First Number:");
         first=input.nextDouble();
         
         System.out.print("Enter Second Number:");
         second=input.nextDouble();
         
         System.out.print("Enter Operator (+, -, *, /):");
         op=input.next();
         
      // perform operation using switch case
         switch(op){
             
             case "+":
                 System.out.println("Result = "+(first+second));
                 break;
                 
             case "-":
                 System.out.println("Result = "+(first-second));
                 break;
                 
             case "*":
                 System.out.println("Result = "+(first*second));
                 break;
                 
             case "/":
                 System.out.println("Result = "+(first/second));
                 break;
                 
             default:
                 System.out.println("Invalid Operator");
         }
         //close the scanner
         input.close();
  }
}
