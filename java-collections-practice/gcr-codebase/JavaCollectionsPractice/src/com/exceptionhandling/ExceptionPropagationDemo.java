package com.exceptionhandling;
public class ExceptionPropagationDemo {

    static void method1() {
        int x = 10 / 0;   // ArithmeticException
    }

    static void method2() {
        method1();       // Exception propagates
    }

    public static void main(String[] args) {

        try {
            method2();   // Caught here
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
