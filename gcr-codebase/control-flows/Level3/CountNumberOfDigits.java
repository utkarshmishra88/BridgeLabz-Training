// program to count the number of digits in an integer

import java.util.Scanner;

public class CountNumberOfDigits{
   public static void main(String[]args){
       
       //Initialize variables
         int number;
         int count=0;
       
         Scanner input=new Scanner(System.in);
         
      // Take input from users
         System.out.print("\nEnter Number:");
         number=input.nextInt();
         
      // loop until number is not equal to zero
         while(number!=0){
             
             // remove last digit
             number=number/10;
             
             // increment count
             count++;
         }
         
      // display the result
         System.out.println("Number of digits is "+count);
         //close the scanner
         input.close();
  }
}
