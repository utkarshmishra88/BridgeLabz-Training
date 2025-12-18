// program to calculate BMI of a person and determine weight status

import java.util.Scanner;

public class CalculateBMI{
   public static void main(String[]args){
       
       //Initialize variables
         double weight;
         double heightInCm;
         double heightInMeter;
         double bmi;
       
         Scanner input=new Scanner(System.in);
         
      // Take input from users
         System.out.print("\nEnter Weight in kg:");
         weight=input.nextDouble();
         
         System.out.print("Enter Height in cm:");
         heightInCm=input.nextDouble();
         
      // convert height from cm to meter
         heightInMeter=heightInCm/100;
         
      // calculate BMI using formula
         bmi=weight/(heightInMeter*heightInMeter);
         
      // display BMI value
         System.out.println("BMI is "+bmi);
         
      // determine weight status based on BMI
         if(bmi<=18.4){
             System.out.println("Status : Underweight");
         }
         else if(bmi>=18.5 && bmi<=24.9){
             System.out.println("Status : Normal");
         }
         else if(bmi>=25.0 && bmi<=39.9){
             System.out.println("Status : Overweight");
         }else{
             System.out.println("Status : Obese");
         }
         //close the scanner
         input.close();
  }
}
