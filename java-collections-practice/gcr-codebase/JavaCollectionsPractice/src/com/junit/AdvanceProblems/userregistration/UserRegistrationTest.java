package com.junit.AdvanceProblems.userregistration;
import static org.junit.Assert.*;
import org.junit.Test;

public class UserRegistrationTest{
	
	// Create an instance of UserRegistration
    UserRegistration r=new UserRegistration();

    @Test
    public void testValidRegistration(){
        assertTrue(r.registerUser("utkarsh","utkarsh@gmail.com","Pass123"));
    }

    @Test(expected=IllegalArgumentException.class)
    public void testInvalidUsername(){
        r.registerUser("", "a@gmail.com", "Pass123");
    }

    @Test(expected=IllegalArgumentException.class)
    public void testInvalidEmail(){
        r.registerUser("user","invalidemail","Pass123");
    }

    @Test(expected=IllegalArgumentException.class)
    public void testInvalidPassword(){
        r.registerUser("user","a@gmail.com","123");
    }

    @Test(expected=IllegalArgumentException.class)
    public void testNullValues(){
        r.registerUser(null,null,null);
    }
}
