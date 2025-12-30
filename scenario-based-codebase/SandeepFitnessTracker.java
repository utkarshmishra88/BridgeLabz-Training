//Java program for Sandeep fitness tracker.
import java.util.Scanner;

public class SandeepFitnessTracker{
	//Main method
	public static void main(String args[]){
		
		//Creating Scanner object
		Scanner sc=new Scanner(System.in);
		System.out.println(" Welcome to Sandeep fitness tracker ");
		System.out.println("------------------------------------");
		//creatin array and taking input from user and initialize variables
		int countPushUp[]=new int[7];
		for(int i=0;i<countPushUp.length;i++){
			System.out.print("Enter "+(i+1)+" day count :");
			countPushUp[i]=sc.nextInt();
		}
		int totalCount=0;
		float averageCount=0;
		int activedays=0;
		
		//for-each loop to interate in array using continue statement for rest day
		for(int ele:countPushUp){
			if(ele==0){
				continue;
			}
			else{
			totalCount+=ele;
			activedays++;
			}
		}
		averageCount=(float)totalCount/activedays;
		
		//Printing result
		System.out.println(" Summary of Sandeep fitness tracking ");
		System.out.println("-------------------------------------");
		System.out.println(" Total pushups   :"+totalCount);
		System.out.println(" Average pushups :"+averageCount);
		
		sc.close();
	}
}	