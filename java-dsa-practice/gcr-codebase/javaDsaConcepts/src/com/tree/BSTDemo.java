package com.tree;
class BSTNode {
    int key;
    BSTNode left, right;

    BSTNode(int key) {
        this.key = key;
    }
}

public class BSTDemo {

    // Insert into BST
    static BSTNode insert(BSTNode root, int key) {
        if (root == null) return new BSTNode(key);
        if (key < root.key)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);
        return root;
    }

    // Inorder traversal
    static void inorder(BSTNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.key + " ");
        inorder(root.right);
    }

    // Search with comparison output
    static void search(BSTNode root, int key) {
        while (root != null) {
            System.out.print(root.key + " ");
            if (key == root.key) return;
            if (key < root.key)
                root = root.left;
            else
                root = root.right;
        }
    }

    // Validate BST
    static boolean isValidBST(BSTNode root, long min, long max) {
        if (root == null) return true;
        if (root.key <= min || root.key >= max) return false;
        return isValidBST(root.left, min, root.key) &&
               isValidBST(root.right, root.key, max);
    }

    // Height of tree
    static int height(BSTNode root) {
        if (root == null) return -1;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {

        int[] values = {50, 30, 70, 20, 40, 60, 80, 10, 25};
        BSTNode root = null;

        for (int v : values)
            root = insert(root, v);

        // Search sequence for 25
        System.out.print("Search path for 25: ");
        search(root, 25);

        // Inorder traversal
        System.out.print("\nInorder Traversal: ");
        inorder(root);

        // Validate given tree
        BSTNode test = new BSTNode(50);
        test.left = new BSTNode(30);
        test.right = new BSTNode(70);
        test.left.left = new BSTNode(20);
        test.left.right = new BSTNode(65);
        test.right.left = new BSTNode(60);
        test.right.right = new BSTNode(80);

        System.out.println("\nIs valid BST: " +
                isValidBST(test, Long.MIN_VALUE, Long.MAX_VALUE));

        // Heights
        System.out.println("Balanced BST height: " + height(root));
        System.out.println("Skewed BST height (9 nodes): " + (values.length - 1));
    }
}
