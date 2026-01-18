package com.collections.list;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class NthFromEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextLine());
        }

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        String result = findNthFromEnd(list, n);
        System.out.println("Nth element from end: " + result);
    }

    public static String findNthFromEnd(LinkedList<String> list, int n) {
        if (n <= 0) {
            return "Invalid N";
        }

        ListIterator<String> fast = list.listIterator();
        ListIterator<String> slow = list.listIterator();

        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (!fast.hasNext()) {
                return "N is greater than list length";
            }
            fast.next();
        }

        // Move both pointers
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
    }
}
