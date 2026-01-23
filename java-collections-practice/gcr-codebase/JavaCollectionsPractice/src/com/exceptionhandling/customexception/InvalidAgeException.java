package com.exceptionhandling.customexception;
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}
