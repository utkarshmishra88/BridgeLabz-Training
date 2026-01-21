package com.tree;
class StudentNode {
    int roll;
    StudentNode left, right;

    StudentNode(int roll) {
        this.roll = roll;
    }
}

public class BSTOperations {

    static StudentNode insert(StudentNode root, int roll) {
        if (root == null) return new StudentNode(roll);
        if (roll < root.roll) root.left = insert(root.left, roll);
        else root.right = insert(root.right, roll);
        return root;
    }

    static StudentNode minValueNode(StudentNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    static StudentNode delete(StudentNode root, int roll) {
        if (root == null) return null;

        if (roll < root.roll)
            root.left = delete(root.left, roll);
        else if (roll > root.roll)
            root.right = delete(root.right, roll);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            StudentNode successor = minValueNode(root.right);
            root.roll = successor.roll;
            root.right = delete(root.right, successor.roll);
        }
        return root;
    }

    static void inorder(StudentNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.roll + " ");
        inorder(root.right);
    }

    static void rangeSearch(StudentNode root, int low, int high) {
        if (root == null) return;
        if (root.roll > low)
            rangeSearch(root.left, low, high);
        if (root.roll >= low && root.roll <= high)
            System.out.print(root.roll + " ");
        if (root.roll < high)
            rangeSearch(root.right, low, high);
    }

    public static void main(String[] args) {

        int[] rolls = {15, 10, 20, 8, 12, 17, 25};
        StudentNode root = null;

        for (int r : rolls)
            root = insert(root, r);

        root = delete(root, 10);
        System.out.print("After deleting 10: ");
        inorder(root);

        root = insert(root, 14);
        System.out.print("\nAfter inserting 14: ");
        inorder(root);

        root = insert(root, 9);
        System.out.print("\nAfter inserting 9: ");
        inorder(root);

        System.out.print("\nRange [10, 20]: ");
        rangeSearch(root, 10, 20);

        System.out.println("\nBest case search: O(1)");
        System.out.println("Worst case search: O(n)");
    }
}
