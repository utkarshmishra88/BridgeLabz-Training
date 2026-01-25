package com.junit.AdvanceProblems.userregistration;

// Class for user registration with validation
public class UserRegistration{
    public boolean registerUser(String u,String e,String p){
    	
        if(u==null||u.isEmpty())
        	throw new IllegalArgumentException("Invalid username");
        if(e==null||!e.contains("@"))
        	throw new IllegalArgumentException("Invalid email");
        if(p==null||p.length()<6)
        	throw new IllegalArgumentException("Invalid password");
        return true;
    }
}
