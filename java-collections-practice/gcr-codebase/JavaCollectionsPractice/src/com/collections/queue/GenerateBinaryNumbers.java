package com.collections.queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        generateBinary(n);
    }

    public static void generateBinary(int n) {
        if (n <= 0) {
            return;
        }

        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        System.out.print("Binary Numbers: ");

        for (int i = 0; i < n; i++) {
            String current = queue.remove();
            System.out.print(current + " ");

            queue.add(current + "0");
            queue.add(current + "1");
        }
    }
}
