// Program to trim leading and trailing spaces using charAt() method

import java.util.Scanner;

public class TrimStringUsingCharAt {

    // method to find start and end index after trimming spaces
    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = 0;

        // find length manually
        int length = findLength(text);

        // trim leading spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                start = i;
                break;
            }
        }

        // trim trailing spaces
        for (int i = length - 1; i >= 0; i--) {
            if (text.charAt(i) != ' ') {
                end = i;
                break;
            }
        }

        return new int[]{start, end};
    }

    // method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    // method to compare two strings using charAt()
    public static boolean compareStrings(String text1, String text2) {

        int len1 = findLength(text1);
        int len2 = findLength(text2);

        if (len1 != len2) {
            return false;
        }

        for (int i = 0; i < len1; i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    // method to find string length without length()
    public static int findLength(String text) {

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

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take input
        System.out.print("Enter text with spaces: ");
        String text = input.nextLine();

        // find trim indexes
        int[] indexes = findTrimIndexes(text);

        // create trimmed string manually
        String manualTrim = createSubstring(text, indexes[0], indexes[1]);

        // trim using built-in method
        String builtInTrim = text.trim();

        // compare both strings
        boolean isSame = compareStrings(manualTrim, builtInTrim);

        // display result
        System.out.println("\nManual Trim Result: [" + manualTrim + "]");
        System.out.println("Built-in Trim Result: [" + builtInTrim + "]");
        System.out.println("Both strings are same: " + isSame);

        input.close();
    }
}
