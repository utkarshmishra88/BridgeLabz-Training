package com.regex;
import java.util.*;
import java.util.regex.*;

class LinkExtractor{
	public static void main(String[] args){
		String text="Visit https://www.google.com and http://example.org for more info.";
		String regex="https?://[^\\s]+";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(text);
		while(m.find())
			System.out.print(m.group()+" ");
	}
}
