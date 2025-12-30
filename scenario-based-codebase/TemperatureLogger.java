//Java program for temperature-logger.
import java.util.Scanner;

public class TemperatureLogger{
	//Main method
	public static void main(String args[]){
		//Scanner object for taking input.
		Scanner sc=new Scanner(System.in);
		double temp[]=new double[7];
		//Taking input and declaring variables.
		for(int i=0;i<temp.length;i++){
			System.out.print("Enter "+(i+1)+" temperature :");
			temp[i]=sc.nextDouble();
		}
		double averageTemp=0.0;
		double totalTemp=0.0;
		double maxTemp=Double.MIN_VALUE;
		
		//for loop for computing maxTemp, averageTemp and totalTemp
		for(int i=0;i<temp.length;i++){
			if(temp[i]>maxTemp){
				maxTemp=temp[i];
				totalTemp+=temp[i];
			}
		}
		averageTemp=totalTemp/temp.length;
		
		//Printing result
		System.out.println("Max temperature is :"+maxTemp);
		System.out.println("Average temperature is :"+averageTemp);
	}
}	
				