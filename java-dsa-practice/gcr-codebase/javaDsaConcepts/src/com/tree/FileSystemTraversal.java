package com.tree;
class DirNode {
    String name;
    DirNode left, right;

    DirNode(String name) {
        this.name = name;
        left = right = null;
    }
}

public class FileSystemTraversal {

    static void inorder(DirNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.name + " ");
        inorder(node.right);
    }

    static void preorder(DirNode node) {
        if (node == null) return;
        System.out.print(node.name + " ");
        preorder(node.left);
        preorder(node.right);
    }

    static void postorder(DirNode node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.name + " ");
    }

    public static void main(String[] args) {

        // Creating file system tree
        DirNode root = new DirNode("root");
        root.left = new DirNode("home");
        root.right = new DirNode("var");

        root.left.left = new DirNode("user");
        root.left.right = new DirNode("docs");

        root.right.right = new DirNode("log");

        root.left.left.left = new DirNode("config");

        // Traversals
        System.out.print("Inorder Traversal: ");
        inorder(root);

        System.out.print("\nPreorder Traversal: ");
        preorder(root);

        System.out.print("\nPostorder Traversal: ");
        postorder(root);
    }
}
