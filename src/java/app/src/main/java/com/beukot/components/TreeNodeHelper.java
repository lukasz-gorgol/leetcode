package com.beukot.components;

public class TreeNodeHelper {
    public int treeSize(TreeNode node) {
        if (node == null)
            return 0;
        int lsize = treeSize(node.left);
        int rsize = treeSize(node.right);
        return  Math.max(lsize, rsize) + rsize + 1;
    }

    private void treeNodeToArrayRecursive(TreeNode node, int nodeIndex, int[] array) {
        if(node == null) return;
        if(nodeIndex < 0) return;
        if(nodeIndex >= array.length) return;

        array[nodeIndex] = node.val;
        if(node.left != null) treeNodeToArrayRecursive(node.left, nodeIndex * 2 + 1, array);
        if(node.right != null) treeNodeToArrayRecursive(node.right, nodeIndex * 2 + 2, array);
    }

    public int[] treeNodeToArray(TreeNode node) {
        if (node == null)
            return new int[] {};
        int size = treeSize(node);
        int[] arr = new int[treeSize(node)];
        for (int i = 0; i < size; i++) arr[i]=Integer.MIN_VALUE;
        treeNodeToArrayRecursive(node, 0, arr);
        return arr;
    }

    public TreeNode arrayToTreeNode(int[] arr) {
        if (arr == null)
            return null;
        if (arr.length == 0)
            return null;
        TreeNode[] tnArr = new TreeNode[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == Integer.MIN_VALUE) {
                tnArr[i] = null;
            } else {
                tnArr[i] = new TreeNode(arr[i]);
            }
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

    public TreeNode findNode(TreeNode root, int p) {
        if (root == null) return root;
        if(root.val == p) return root;
        if(root.val > p) return findNode(root.left, p);
        return findNode(root.right, p);
    }
}
