package com.regex;
import java.util.regex.*;

// Censor bad words in text
class BadWordCensor{
	//Main method
	public static void main(String[] args){
		//Sample text
		String text="This is a damn bad example with some stupid words.";
		//Regex pattern
		String regex="\\b(damn|stupid)\\b";
		
		Pattern p=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher(text);
		
		String result=m.replaceAll("****");
		
		System.out.println(result);
	}
}
