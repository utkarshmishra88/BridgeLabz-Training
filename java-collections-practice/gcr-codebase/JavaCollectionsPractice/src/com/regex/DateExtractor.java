package com.regex;
import java.util.regex.*;

//Extract dates in DD/MM/YYYY format from a string
class DateExtractor{
	//Main method
	public static void main(String[] args){
		//Sample text
		String text="The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
		//Regex pattern
		String regex="\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}\\b";
		
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(text);
		
		while(m.find())
			System.out.print(m.group()+" ");
	}
}
