package com.runtimeanalysis;
import java.util.*;

public class SearchDataStructureComparison {
	// Linear search in array
    public static boolean arraySearch(int[] arr, int target) {
        for (int x : arr) {
            if (x == target)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input for dataset size
        System.out.print("Enter dataset size: ");
        int N = sc.nextInt();

        // User input for target element
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        //  Create Data
        int[] array = new int[N];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        // Array Search 
        long startArray = System.nanoTime();
        arraySearch(array, target);
        long endArray = System.nanoTime();

        // HashSet Search
        long startHashSet = System.nanoTime();
        hashSet.contains(target);
        long endHashSet = System.nanoTime();

        //  TreeSet Search 
        long startTreeSet = System.nanoTime();
        treeSet.contains(target);
        long endTreeSet = System.nanoTime();

        //  Output 
        System.out.println("\n--- Search Performance Comparison ---");
        System.out.println("Dataset Size: " + N);
        System.out.println("Array Search    : " + (endArray - startArray) / 1_000_000.0 + " ms");
        System.out.println("HashSet Search  : " + (endHashSet - startHashSet) / 1_000_000.0 + " ms");
        System.out.println("TreeSet Search  : " + (endTreeSet - startTreeSet) / 1_000_000.0 + " ms");

        sc.close();
    }
}