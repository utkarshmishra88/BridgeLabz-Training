package com.sorting.icecreamrush;
import java.util.*;

public class IceCreamRush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Flavor> list = new ArrayList<>();

        System.out.print("Enter number of flavors: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter flavor name and sold count: ");
            list.add(new Flavor(sc.next(), sc.nextInt()));
        }

        // bubble sort by popularity
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).sold > list.get(j + 1).sold) {
                    Flavor temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        // sorted flavors
        for (Flavor f : list)
            System.out.println(f.name + " " + f.sold);
    }
}