package com.beukot.easy;

import java.util.Stack;
import com.beukot.components.TreeNode;

/* 
 * Invert Binary tree
 * https://leetcode.com/problems/invert-binary-tree/description/
 * #226
 */
public class InvertBinaryTree {
    /* 
     * Given the root of a binary tree, invert the tree, and return its root.
     */
    public TreeNode invertTree(TreeNode root) {
        if(root != null)
        {
            Stack<TreeNode> stack = new Stack<>();
            stack.add(root);
            TreeNode n, nc;
            while(!stack.isEmpty()) {
                n = stack.pop();
                nc = n.left;
                n.left = n.right;
                n.right = nc;
                if(n.left != null) stack.add(n.left);
                if(n.right != null) stack.add(n.right);
            }
        }
        return root;
    }
}
