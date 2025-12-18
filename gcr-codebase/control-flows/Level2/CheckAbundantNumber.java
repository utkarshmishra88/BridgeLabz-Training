// program to check whether a number is an Abundant Number or not

import java.util.Scanner;

public class CheckAbundantNumber{
   public static void main(String[]args){
       
       //Initialize variables
         int number;
         int sum=0;
       
         Scanner input=new Scanner(System.in);
         
      // Take input from users
         System.out.print("\nEnter Number:");
         number=input.nextInt();
         
      // find sum of divisors
         for(int i=1;i<number;i++){
             
             // check divisibility
             if(number%i==0){
                 sum=sum+i;
             }
         }
         
      // check abundant condition
         if(sum>number){
             System.out.println(number+" is an Abundant Number");
         }else{
             System.out.println(number+" is not an Abundant Number");
         }
         //close the scanner
         input.close();
  }
}
