package com.beukot.components;

import java.util.ArrayList;

/**
 * Tree Node Helper class for Tree Node problems with arrays
 */
public class TreeNodeHelper {
    /**
     * Calculate size of the tree
     * @param node - tree root
     * @return size of the three
     */
    public int treeSize(TreeNode node) {
        if (node == null)
            return 0;
        int lsize = treeSize(node.left);
        int rsize = treeSize(node.right);
        return Math.max(lsize, rsize) + rsize + 1;
    }

    /**
     * Convert Tree Node to int array
     * 
     * @param node - tree root
     * @return int array where Integer.MIN_VALUE means null
     */
    public int[] treeNodeToArray(TreeNode node) {
        if (node == null)
            return new int[] {};
        ArrayList<TreeNode> process = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();
        process.add(node);
        TreeNode n;
        while (!process.isEmpty()) {
            n = process.remove(0);
            if (n.val == Integer.MIN_VALUE) {
                for (int i = process.size() - 1; i >= 0; i--) {
                    if (process.get(i).val != Integer.MIN_VALUE) {
                        output.add(n.val);
                        break;
                    }
                }
            } else {
                output.add(n.val);
                process.add(n.left == null ? new TreeNode(Integer.MIN_VALUE) : n.left);
                process.add(n.right == null ? new TreeNode(Integer.MIN_VALUE) : n.right);
            }
        }
        return output.stream().mapToInt(x -> x).toArray();
    }

    /**
     * Convert int array to Tree Node
     * 
     * @param arr - int array where Integer.MIN_VALUE means null
     * @return Tree Node root
     */
    public TreeNode arrayToTreeNode(int[] arr) {
        if (arr == null)
            return null;
        if (arr.length == 0)
            return null;
        ArrayList<TreeNode> build = new ArrayList<>();
        TreeNode root = new TreeNode(arr[0]);
        boolean nextLeft = true;
        build.add(root);
        int len = arr.length;
        int i = 0;
        TreeNode n;
        while (++i < len) {
            if (nextLeft) {
                if (arr[i] != Integer.MIN_VALUE) {
                    n = new TreeNode(arr[i]);
                    build.get(0).left = n;
                    build.add(n);
                }
                nextLeft = false;
            } else {
                if (arr[i] != Integer.MIN_VALUE) {
                    n = new TreeNode(arr[i]);
                    build.get(0).right = n;
                    build.add(n);
                }
                build.remove(0);
                nextLeft = true;
            }
        }
        return root;
    }

    /**
     * Find node of tree with given value 
     * 
     * @param root - tree root
     * @param p - value to find
     * @return Tree Node with expected value 
     */
    public TreeNode findNode(TreeNode root, int p) {
        if (root == null)
            return root;
        if (root.val == p)
            return root;
        if (root.val > p)
            return findNode(root.left, p);
        return findNode(root.right, p);
    }
}