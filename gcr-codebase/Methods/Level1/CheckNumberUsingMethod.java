//Java program to check whether a number is positive,negative or zero.
import java.util.Scanner;

public class CheckNumberUsingMethod{

    //creating method to check number.
    public static int checkNumber(int number){
	    if(number<0)
		   return -1;
		else if(number>0)
		   return 1;
		else
		   return 0;
	}

    //main method	
    public static void main(String args[]){
		
         //Create Scanner object to take input.
		 Scanner input=new Scanner(System.in);
		 System.out.println("Enter a number :");
		 int number=input.nextInt();
		 
		 //Print after checking with method.
		 System.out.println(checkNumber(number));
		 
		 //closing scanner stream
		 input.close();
		 
    }
}		