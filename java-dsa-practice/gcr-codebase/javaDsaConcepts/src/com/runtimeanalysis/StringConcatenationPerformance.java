package com.runtimeanalysis;
import java.util.Scanner;

public class StringConcatenationPerformance {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        
		// Take user input
		System.out.println("Enter number of concatenation operations: ");
        int N = sc.nextInt();

        // String
        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < N; i++) {
            s = s + "a";
        }
        long stringTime = System.nanoTime() - start;

        // StringBuilder
        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("a");
        }
        long builderTime = System.nanoTime() - start;

        // StringBuffer
        start = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sbuf.append("a");
        }
        long bufferTime = System.nanoTime() - start;

        System.out.println("\n--- Relative Performance ---");
        System.out.println("String        : " + stringTime / 1000000 + " ms");
        System.out.println("StringBuilder : " + builderTime / 1000000 + " ms");
        System.out.println("StringBuffer  : " + bufferTime / 1000000 + " ms");

        sc.close();
    }
}