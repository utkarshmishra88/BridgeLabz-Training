// program to check whether a number is a prime number or not

import java.util.Scanner;

public class CheckPrimeNumber{
   public static void main(String[]args){
       
       //Initialize variables
         int number;
         boolean isPrime=true;
       
         Scanner input=new Scanner(System.in);
         
      // Take input from users
         System.out.print("\nEnter Number:");
         number=input.nextInt();
         
      // Prime number check is valid only for numbers greater than 1
         if(number>1){
             
             // loop from 2 to number-1
             for(int i=2;i<number;i++){
                 
                 // check divisibility
                 if(number%i==0){
                     isPrime=false;
                     break;
                 }
             }
             
             // display result
             if(isPrime){
                 System.out.println(number+" is a Prime Number");
             }else{
                 System.out.println(number+" is not a Prime Number");
             }
             
         }else{
             System.out.println("Prime numbers are greater than 1");
         }
         // close the scanner
         input.close();
  }
}
