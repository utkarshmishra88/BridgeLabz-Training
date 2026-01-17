package com.collections.list;
import java.util.*;

public class RotateList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.print("Enter rotation count: ");
        int k = sc.nextInt();
        k = k % n; //handle large rotations

        List<Integer> rotated = new ArrayList<>();
        // add elements from k to end
        for (int i = k; i < n; i++) {
            rotated.add(list.get(i));
        }
        // add elements from start to k
        for (int i = 0; i < k; i++) {
            rotated.add(list.get(i));
        }

        System.out.println("Original List: " + list);
        System.out.println("Rotated List: " + rotated);

        sc.close();
    }
}
