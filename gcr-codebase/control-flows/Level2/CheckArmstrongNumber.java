// program to check whether a number is an armstrong number or not

import java.util.Scanner;

public class CheckArmstrongNumber{
   public static void main(String[]args){
       
       //Initialize variables
         int number;
         int sum=0;
         int originalNumber;
       
         Scanner input=new Scanner(System.in);
         
      // Take input from users
         System.out.print("\nEnter Number:");
         number=input.nextInt();
         
      // assign input number to originalNumber
         originalNumber=number;
         
      // loop till originalNumber is not equal to zero
         while(originalNumber!=0){
             
             // find last digit using modulus operation
             int digit=originalNumber%10;
             
             // find cube of digit and add to sum
             sum=sum+(digit*digit*digit);
             
             // remove last digit using division operation
             originalNumber=originalNumber/10;
         }
         
      // check armstrong condition
         if(sum==number){
             System.out.println(number+" is an Armstrong Number");
         }else{
             System.out.println(number+" is not an Armstrong Number");
         }
         //close the scanner
         input.close();
  }
}
