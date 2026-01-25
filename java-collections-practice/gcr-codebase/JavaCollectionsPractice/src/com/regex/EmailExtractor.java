package com.regex;
import java.util.Scanner;
import java.util.regex.*;

class EmailExtractor{
	//Main method
	public static void main(String[] args){
		//Scanner for user input
		Scanner sc=new Scanner(System.in);
		//Regex pattern
		String regex="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
		
		System.out.print("Enter text: ");
		String text=sc.nextLine();
		
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(text);
		
		while(m.find())
			System.out.println(m.group());
	}
}
