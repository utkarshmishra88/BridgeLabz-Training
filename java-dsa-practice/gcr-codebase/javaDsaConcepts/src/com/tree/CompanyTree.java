package com.tree;
import java.util.*;

class TreeNode {
    String data;
    List<TreeNode> children;

    TreeNode(String data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}

public class CompanyTree {

    // Find leaf nodes
    static void findLeafNodes(TreeNode node) {
        if (node.children.isEmpty()) {
            System.out.println(node.data);
            return;
        }
        for (TreeNode child : node.children) {
            findLeafNodes(child);
        }
    }

    // Height of tree
    static int height(TreeNode node) {
        if (node == null) return -1;
        int max = -1;
        for (TreeNode child : node.children) {
            max = Math.max(max, height(child));
        }
        return max + 1;
    }

    // Depth of a node
    static int depth(TreeNode root, String key, int level) {
        if (root.data.equals(key)) return level;
        for (TreeNode child : root.children) {
            int d = depth(child, key, level + 1);
            if (d != -1) return d;
        }
        return -1;
    }

    // Find ancestors
    static boolean printAncestors(TreeNode root, String key) {
        if (root == null) return false;
        if (root.data.equals(key)) return true;

        for (TreeNode child : root.children) {
            if (printAncestors(child, key)) {
                System.out.println(root.data);
                return true;
            }
        }
        return false;
    }

    // Find degree of a node
    static int degree(TreeNode root, String key) {
        if (root.data.equals(key)) return root.children.size();
        for (TreeNode child : root.children) {
            int d = degree(child, key);
            if (d != -1) return d;
        }
        return -1;
    }

    public static void main(String[] args) {

        // Creating nodes
        TreeNode CEO = new TreeNode("CEO");
        TreeNode CTO = new TreeNode("CTO");
        TreeNode CFO = new TreeNode("CFO");
        TreeNode devLead = new TreeNode("Dev Lead");
        TreeNode HR = new TreeNode("HR");
        TreeNode dev1 = new TreeNode("Dev1");
        TreeNode dev2 = new TreeNode("Dev2");

        // Building tree
        CEO.children.add(CTO);
        CEO.children.add(CFO);

        CTO.children.add(devLead);
        CTO.children.add(HR);

        devLead.children.add(dev1);
        devLead.children.add(dev2);

        // a) Leaf nodes
        System.out.println("Leaf Nodes:");
        findLeafNodes(CEO);

        // b) Height of tree
        System.out.println("\nHeight of Tree: " + height(CEO));

        // c) Depth of Dev Lead
        System.out.println("\nDepth of Dev Lead: " + depth(CEO, "Dev Lead", 0));

        // d) Ancestors of Dev1
        System.out.println("\nAncestors of Dev1:");
        printAncestors(CEO, "Dev1");

        // e) Degree of CTO
        System.out.println("\nDegree of CTO: " + degree(CEO, "CTO"));
    }
}
