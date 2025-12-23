// Program to find frequency of characters using ASCII values

import java.util.Scanner;

public class CharFrequencyASCII {

    // method to find character frequencies
    public static String[][] findFrequency(String text) {

        // frequency array for ASCII characters
        int[] freq = new int[256];

        // count frequency
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // count unique characters
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] != 0) {
                count++;
                freq[text.charAt(i)] = 0;
            }
        }

        // reset frequency array
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // store result
        String[][] result = new String[count][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.next();

        String[][] result = findFrequency(text);

        System.out.println("Character Frequency:");
        for (String[] row : result) {
            System.out.println(row[0] + " -> " + row[1]);
        }

        input.close();
    }
}
