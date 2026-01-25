package com.regex;
import java.util.regex.*;

// Validate Social Security Number (SSN)
class SSNValidator{
	//Main method
	public static void main(String[] args){
		//Sample text
		String text="My SSN is 123-45-6789.";
		//Regex pattern
		String regex="\\b\\d{3}-\\d{2}-\\d{4}\\b";
		
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(text);
		
		if(m.find())
			System.out.println(m.group()+" is valid");
		else
			System.out.println("Invalid SSN");
	}
}
