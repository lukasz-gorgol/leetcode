package com.beukot.components;

import java.util.ArrayList;
import java.util.Stack;

public class TreeNodeHelper {
    public int treeSize(TreeNode node) {
        if (node == null)
            return 0;
        int size = 0;
        Stack<TreeNode> process = new Stack<>();
        process.add(node);
        TreeNode n;
        while (!process.isEmpty()) {
            size++;
            n = process.pop();
            if (n.left != null)
                process.add(n.left);
            if (n.right != null)
                process.add(n.right);
        }
        return size;
    }

    public int[] treeNodeToArray(TreeNode node) {
        if (node == null)
            return new int[]{};
        ArrayList<TreeNode> process = new ArrayList<>();
        process.add(node);
        int[] arr = new int[treeSize(node)];
        int ptr = 0;
        TreeNode n;
        while (!process.isEmpty()) {
            n = process.remove(0);
            arr[ptr++] = n.val;
            if (n.left != null)
                process.add(n.left);
            if (n.right != null)
                process.add(n.right);
        }
        return arr;
    }

    public TreeNode arrayToTreeNode(int[] arr) {
        if (arr == null)
            return null;
        if (arr.length == 0)
            return null;
        TreeNode[] tnArr = new TreeNode[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            tnArr[i] = new TreeNode(arr[i]);
        }
        for (int i = arr.length - 1; i > 0; i--) {
            if (i % 2 == 0) {
                tnArr[(int) Math.ceil(i / 2.0) - 1].right = tnArr[i];
            } else {
                tnArr[(int) Math.ceil(i / 2.0) - 1].left = tnArr[i];
            }
        }

        return tnArr[0];
    }
}
