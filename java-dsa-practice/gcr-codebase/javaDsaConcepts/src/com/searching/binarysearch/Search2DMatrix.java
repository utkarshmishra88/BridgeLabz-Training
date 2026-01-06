package com.searching.binarysearch;
import java.util.Scanner;

public class Search2DMatrix {

    static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            // Convert 1D index to 2D position
            int row = mid / cols;
            int col = mid % cols;

            int midValue = matrix[row][col];

            if (midValue == target) {
                return true; // found
            } else if (target < midValue) {
                right = mid - 1; // search left
            } else {
                left = mid + 1; // search right
            }
        }
        return false; // not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        boolean result = searchMatrix(matrix, target);

        System.out.println(result);

        sc.close();
    }
}
