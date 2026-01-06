package com.stringbuilder;
import java.util.Scanner;

public class ReverseStringUsingStringBuilder {

    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);        // Step 2
        sb.reverse();            // Step 3
        return sb.toString();    // Step 4
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
    }
}

