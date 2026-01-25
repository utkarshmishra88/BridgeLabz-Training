package com.junit.AdvanceProblems.passwordvalidator;
public class PasswordValidator {
    
	// A valid password must be at least 8 characters long,
    public boolean isValid(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasDigit = false;
        // must contain at least one uppercase letter and one digit
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        return hasUppercase && hasDigit;
    }
}
