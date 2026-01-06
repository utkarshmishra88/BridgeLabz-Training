package com.stringbuilder;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesUsingStringBuilder {

    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String output = removeDuplicates(str);
        System.out.println("String without duplicates: " + output);
    }
}

