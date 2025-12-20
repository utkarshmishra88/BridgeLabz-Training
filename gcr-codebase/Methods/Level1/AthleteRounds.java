//Java program to calculate number of rounds to complete 5km in triangular park.
import java.util.Scanner;

public class AthleteRounds{

    //creating method to compute student-handshake.
    public double totalRounds(double distance,double perimeter){
	    return distance/perimeter;
	}

    //main method	
    public static void main(String args[]){
	    
		 //Creating StudentHandShake object for accessing methods.
		 AthleteRounds athleteRounds=new AthleteRounds();
		
         //Create Scanner object to take input.
		 Scanner input=new Scanner(System.in);
		 System.out.println("Enter 1st side of triangle :");
		 double side1=input.nextDouble();
		 System.out.println("Enter 2nd side of triangle :");
		 double side2=input.nextDouble();
		 System.out.println("Enter 3rd side of triangle :");
		 double side3=input.nextDouble();
		 
		 //calculate perimeter and total distance wants to complete
		 double perimeter=side1+side2+side3;
		 double distInKm=5;
		 double distInM=distInKm*1000;
		 
		 //calculate number of totalround using method
		 double numberOfRounds=athleteRounds.totalRounds(distInM,perimeter);
		 
		 System.out.println("The total round are "+numberOfRounds);
		 
		 //closing scanner stream
		 input.close();
		 
    }
}		