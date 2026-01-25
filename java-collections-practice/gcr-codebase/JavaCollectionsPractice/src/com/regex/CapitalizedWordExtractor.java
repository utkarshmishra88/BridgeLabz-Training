package com.regex;
import java.util.*;
import java.util.regex.*;

//Extract capitalized words from a sentence
class CapitalizedWordExtractor{
	//Main method
	public static void main(String[] args){
		//Scanner for user input
		Scanner sc=new Scanner(System.in);
		//Regex pattern
		String regex="\\b[A-Z][a-z]*\\b";
		
		System.out.print("Enter sentence: ");
		String text=sc.nextLine();
		
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(text);
		
		while(m.find())
			System.out.print(m.group()+" ");
	}
}
