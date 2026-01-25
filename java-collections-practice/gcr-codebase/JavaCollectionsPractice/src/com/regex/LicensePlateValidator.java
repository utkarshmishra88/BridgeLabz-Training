package com.regex;
import java.util.Scanner;
import java.util.regex.*;

class LicensePlateValidator{
	//Main method
	public static void main(String[] args){
		//Scanner for user input
		Scanner sc=new Scanner(System.in);
		//Regex pattern
		String regex="^[A-Z]{2}[0-9]{4}$";
		
		System.out.print("Enter license plate: ");
		String plate=sc.nextLine();
		
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(plate);
		
		if(m.matches())
			System.out.println("Valid License Plate");
		else
			System.out.println("Invalid License Plate");
	}
}
