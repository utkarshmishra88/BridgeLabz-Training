package com.regex;
import java.util.regex.*;

// Validate IP Address
class IPAddressValidator{
	//Main method
	public static void main(String[] args){
		//Sample IP address
		String ip="192.168.1.1";
		//Regex pattern
		String regex="\\b((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\b";
		
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(ip);
		
		if(m.matches())
			System.out.println("Valid IP Address");
		else
			System.out.println("Invalid IP Address");
	}
}
