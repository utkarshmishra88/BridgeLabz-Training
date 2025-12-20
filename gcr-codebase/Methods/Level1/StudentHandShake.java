//Java program to calculate number of hanshake.
import java.util.Scanner;

public class StudentHandShake{

    //creating method to compute student-handshake.
    public int handShake(int number){
	    return (number*(number-1))/2;
	}

    //main method	
    public static void main(String args[]){
	    
		 //Creating StudentHandShake object for accessing methods.
		 StudentHandShake studentHandshake=new StudentHandShake();
		
         //Create Scanner object to take input.
		 Scanner input=new Scanner(System.in);
		 System.out.println("Enter number of students :");
		 int numberOfStudents=input.nextInt();
		 
		 //calculate number of handshake using method
		 int numberOfHandshake=studentHandshake.handShake(numberOfStudents);
		 
		 System.out.println("The possible handshake are "+numberOfHandshake);
		 
		 //closing scanner stream
		 input.close();
		 
    }
}		