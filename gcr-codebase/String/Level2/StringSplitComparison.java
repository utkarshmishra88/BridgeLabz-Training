// Java program to split text into words without using split() method

import java.util.Scanner;

public class StringSplitComparison {

    // method to find string length without using length()
    public static int findLengthManually(String text) {

        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }

    // method to split text into words manually
    public static String[] splitTextManually(String text) {

        int length = findLengthManually(text);
        int wordCount = 1;

        // count words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        String word = "";

        // extract words
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {
                words[index++] = word;
                word = "";
            }
        }

        // add last word
        words[index] = word;

        return words;
    }

    // method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    // simple display method
    public static void displayResult(String[] manualWords, String[] builtInWords, boolean result) {

        System.out.println("\nWords using manual method:");
        for (String word : manualWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using split() method:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nAre both results same? " + result);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take input
        System.out.print("Enter text: ");
        String text = input.nextLine();

        // manual split
        String[] manualWords = splitTextManually(text);

        // built-in split
        String[] builtInWords = text.split(" ");

        // compare both
        boolean comparisonResult = compareArrays(manualWords, builtInWords);

        // display result
        displayResult(manualWords, builtInWords, comparisonResult);

        // close scanner
        input.close();
    }
}
