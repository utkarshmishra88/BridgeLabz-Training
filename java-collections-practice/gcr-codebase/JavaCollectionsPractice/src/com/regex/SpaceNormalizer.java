package com.regex;
import java.util.*;
import java.util.regex.*;

class SpaceNormalizer{
	public static void main(String[] args){
		String text="This   is    an   example   with   multiple    spaces.";
		String regex="\\s+";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(text);
		String result=m.replaceAll(" ");
		System.out.println(result);
	}
}
