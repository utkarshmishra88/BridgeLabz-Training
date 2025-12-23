// Java program to find unique characters in a string using charAt()

import java.util.Scanner;

public class UniqueCharacters {

    // method to find length of string without using length()
    public static int findLength(String text) {

        int count = 0;

        // loop until charAt throws exception
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // exception occurs when index goes out of range
        }

        return count;
    }

    // method to find unique characters and return them as 1D array
    public static char[] findUniqueCharacters(String text) {

        int length = findLength(text);

        // array to store unique characters temporarily
        char[] temp = new char[length];
        int uniqueCount = 0;

        // outer loop to pick each character
        for (int i = 0; i < length; i++) {

            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // inner loop to check previous characters
            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // store unique character
            if (isUnique) {
                temp[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // create new array of exact size
        char[] result = new char[uniqueCount];

        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take input from user
        System.out.print("Enter a string: ");
        String text = input.next();

        // call method to find unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // display result
        System.out.print("Unique characters: ");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }

        // close scanner
        input.close();
    }
}
