package com.junit.AdvanceProblems.passwordvalidator;
import static org.junit.Assert.*;
import org.junit.Test;

public class PasswordValidatorTest {

    private PasswordValidator validator = new PasswordValidator();

    @Test
    public void testValidPassword() {
        assertTrue(validator.isValid("Password1"));
    }
    
    // Additional test cases
    @Test
    public void testPasswordTooShort() {
        assertFalse(validator.isValid("Pass1"));
    }

    @Test
    public void testNoUppercase() {
        assertFalse(validator.isValid("password1"));
    }

    @Test
    public void testNoDigit() {
        assertFalse(validator.isValid("Password"));
    }

    @Test
    public void testNullPassword() {
        assertFalse(validator.isValid(null));
    }
}
