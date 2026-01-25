package com.regex;
import java.util.Scanner;
import java.util.regex.*;

class HexColorValidator{
	//Main method
	public static void main(String[] args){
		//Scanner for user input
		Scanner sc=new Scanner(System.in);
		//Regex pattern
		String regex="^#[0-9A-Fa-f]{6}$";
		
		System.out.print("Enter hex color code: ");
		String color=sc.nextLine();
		
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(color);
		
		if(m.matches())
			System.out.println("Valid Hex Color");
		else
			System.out.println("Invalid Hex Color");
	}
}
