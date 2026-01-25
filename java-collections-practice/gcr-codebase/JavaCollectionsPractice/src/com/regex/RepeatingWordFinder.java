package com.regex;
import java.util.regex.*;

// Find repeating words in text
class RepeatingWordFinder{
	//Main method
	public static void main(String[] args){
		//Sample text
		String text="This is is a repeated repeated word test.";
		//Regex pattern
		String regex="\\b(\\w+)\\s+\\1\\b";
		
		Pattern p=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher(text);
		
		while(m.find())
			System.out.print(m.group(1)+" ");
	}
}
