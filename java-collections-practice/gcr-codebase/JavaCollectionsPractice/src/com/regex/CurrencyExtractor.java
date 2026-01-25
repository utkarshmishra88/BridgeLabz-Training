package com.regex;
import java.util.regex.*;

// Extract currency amounts from text
class CurrencyExtractor{
	// Main method
	public static void main(String[] args){
		// Sample text
		String text="The price is $45.99, and the discount is 10.50.";
		// Regex pattern
		String regex="\\$?\\b\\d+\\.\\d{2}\\b";
		
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(text);
		
		while(m.find())
			System.out.print(m.group()+" ");
	}
}
