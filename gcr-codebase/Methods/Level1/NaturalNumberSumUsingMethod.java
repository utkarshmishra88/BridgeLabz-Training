//Java program for sum of n natural numbers.
import java.util.Scanner;

public class NaturalNumberSumUsingMethod{

    //creating method to sum n natural number.
    public static int sum(int number){
	    int sum=0;
	    for(int i=1;i<=number;i++){
		    sum+=i;
		}	
		return sum;
	}

    //main method	
    public static void main(String args[]){
		
         //Create Scanner object to take input.
		 Scanner input=new Scanner(System.in);
		 System.out.println("Enter a number :");
		 int number=input.nextInt();
		 
		 System.out.println(sum(number));
		 
		 //Closing input stream.
		 input.close();
		 
    }
}		