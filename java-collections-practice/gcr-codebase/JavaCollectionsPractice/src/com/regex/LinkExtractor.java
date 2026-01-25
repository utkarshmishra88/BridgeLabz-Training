package com.regex;
import java.util.regex.*;

//Extract URLs from text
class LinkExtractor{
	//Main method
	public static void main(String[] args){
		//Sample text
		String text="Visit https://www.google.com and http://example.org for more info.";
		//Regex pattern
		String regex="https?://[^\\s]+";
		
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(text);
		
		while(m.find())
			System.out.print(m.group()+" ");
	}
}
