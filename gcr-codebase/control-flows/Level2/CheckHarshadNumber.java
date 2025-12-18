// program to check whether a number is a Harshad Number or not

import java.util.Scanner;

public class CheckHarshadNumber{
   public static void main(String[]args){
       
       //Initialize variables
         int number;
         int sum=0;
         int temp;
       
         Scanner input=new Scanner(System.in);
         
      // Take input from users
         System.out.print("\nEnter Number:");
         number=input.nextInt();
         
      // assign number to temp variable
         temp=number;
         
      // loop to find sum of digits
         while(temp!=0){
             
             // get last digit
             int digit=temp%10;
             
             // add digit to sum
             sum=sum+digit;
             
             // remove last digit
             temp=temp/10;
         }
         
      // check Harshad condition
         if(number%sum==0){
             System.out.println(number+" is a Harshad Number");
         }else{
             System.out.println(number+" is not a Harshad Number");
         }
         //close the scanner
         input.close();
  }
}
