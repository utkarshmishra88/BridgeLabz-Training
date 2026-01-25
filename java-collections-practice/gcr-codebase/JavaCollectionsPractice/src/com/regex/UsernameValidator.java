package com.regex;
import java.util.regex.*;

public class UsernameValidator{
	//Main method
	public static void main(String[] args){
		
		String[] u={"user_123","123user","us"};
		
		//Regex Pattern for username validation
		Pattern p=Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
		
		for(String s:u){
			Matcher m=p.matcher(s);
			System.out.println(s+" => "+(m.matches()?"Valid":"Invalid"));
		}
	}
}
