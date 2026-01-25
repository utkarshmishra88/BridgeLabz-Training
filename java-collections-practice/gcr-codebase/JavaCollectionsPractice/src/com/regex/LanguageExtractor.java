package com.regex;
import java.util.regex.*;

//Extract programming languages from text
class LanguageExtractor{
	//Main method
	public static void main(String[] args){
		//Sample text
		String text="I love Java, Python, and JavaScript, but I haven't tried Go yet.";
		//Regex pattern
		String regex="\\b(Java|Python|JavaScript|Go)\\b";
		
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(text);
		
		while(m.find())
			System.out.print(m.group()+" ");
	}
}
