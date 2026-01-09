package com.runtimeanalysis;
import java.util.Scanner;

public class FibonacciComparison {

    // Recursive fibonacci
    public static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative fibonacci
    public static int fibonacciIterative(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter Fibonacci number (N): ");
        int n = sc.nextInt();

        // Recursive 
        long startRec = System.nanoTime();
        int recResult = fibonacciRecursive(n);
        long endRec = System.nanoTime();

        double recTime = (endRec - startRec) / 1_000_000.0;

        // Iterative 
        long startItr = System.nanoTime();
        int itrResult = fibonacciIterative(n);
        long endItr = System.nanoTime();

        double itrTime = (endItr - startItr) / 1_000_000.0;

        // Output
        System.out.println("\n--- Fibonacci Comparison ---");
        System.out.println("Fibonacci Number: " + n);
        System.out.println("Recursive Result : " + recResult);
        System.out.println("Iterative Result : " + itrResult);

        System.out.println("\nTime Taken:");
        System.out.println("Recursive Time : " + recTime + " ms");
        System.out.println("Iterative Time : " + itrTime + " ms");

        sc.close();
    }
}
