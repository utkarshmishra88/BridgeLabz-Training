package com.streams;
import java.io.*;

public class UserInfoToFile {
    public static void main(String[] args) {

        BufferedReader br = null;
        FileWriter fw = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter name: ");
            String name = br.readLine();

            System.out.print("Enter age: ");
            String age = br.readLine();

            System.out.print("Enter favorite programming language: ");
            String lang = br.readLine();

            fw = new FileWriter("user_info.txt");
            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Favorite Language: " + lang + "\n");

            System.out.println("Data saved successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
                if (fw != null) fw.close();
            } catch (IOException e) {
                System.out.println("Error closing resources.");
            }
        }
    }
}
