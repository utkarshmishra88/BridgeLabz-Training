//program to check whether a person can vote
import java.util.Scanner;

public class CanVote{
    public static void main(String[] args){
	//create a Scanner object
	Scanner input=new Scanner(System.in);

	//get input value for age 
	System.out.print("Enter the age: ");
	int age=input.nextInt();

	//check the age and display the result
	if(age>=18){	
	    System.out.println("The person's age is "+ age + " and can vote.");
	}
	else{
	    System.out.println("The person's age is "+ age + " and cannot vote.");
	}	

	input.close();  //closing the Scanner stream
	
    }
}