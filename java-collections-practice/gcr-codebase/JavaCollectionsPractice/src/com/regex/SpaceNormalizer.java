package com.regex;
import java.util.regex.*;

//Normalize multiple spaces to single space
class SpaceNormalizer{
	//Main method
	public static void main(String[] args){
		//Sample text
		String text="This   is    an   example   with   multiple    spaces.";
		//Regex pattern
		String regex="\\s+";
		
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(text);
		
		String result=m.replaceAll(" ");
		System.out.println(result);
	}
}
