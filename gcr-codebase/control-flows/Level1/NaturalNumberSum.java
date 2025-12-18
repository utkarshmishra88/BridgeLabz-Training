// Writting Java code to check for Natural number and their Sum
import java.util.Scanner;

public class NaturalNumberSum{
    public static void main(String[] args){
        // Create Scanner object to read input
        Scanner input = new Scanner(System.in);
		
		// Read input from the user
        System.out.print("Enter number: ");
        int number = input.nextInt();
		int sum = 0;
		
		// Checking number if Naturalor not and printing sum 
		if(number>0){
		  sum = (number*(number+1))/2;
		  System.out.println("The sum of "+ number +" Natral number is "+ sum );
		} else{
		  System.out.println("The Number "+ number +" is not a Natural number");
		}
		
		// Close the scanner
        input.close();
		
}
}