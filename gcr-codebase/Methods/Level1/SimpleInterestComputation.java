//Java program to calculate simple interest.
import java.util.Scanner;

public class SimpleInterestComputation{

    //creating method to compute simple-interest.
    public double simpleInterest(double principal,double rate,double time){
	    double simpleInterest;
		simpleInterest=(principal*rate*time)/100;
		return simpleInterest;
	}

    //main method	
    public static void main(String args[]){
	    
		 //Creating SimpleInterestComputation object for accessing methods.
		 SimpleInterestComputation SIcalculation=new SimpleInterestComputation();
		
         //Create Scanner object to take input.
		 Scanner input=new Scanner(System.in);
		 System.out.println("Enter principle :");
		 double principal=input.nextDouble();
		 System.out.println("Enter rate :");
		 double rate=input.nextDouble();
		 System.out.println("Enter time :");
		 double time=input.nextDouble();
		 
		 //calculate simple-interest using method
		 double simpleInterestValue=SIcalculation.simpleInterest(principal,rate,time);
		 
		 System.out.println("The simple Interest is "+simpleInterestValue+"for principal "+principal+", rate "+" and Time "+time);
		 
		 //closing scanner stream
		 input.close();
		 
    }
}		