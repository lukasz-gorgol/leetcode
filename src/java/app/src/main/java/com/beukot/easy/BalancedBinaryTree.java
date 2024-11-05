package com.beukot.easy;

import com.beukot.components.TreeNode;

/**
 * Balanced Binary Tree
 * https://leetcode.com/problems/balanced-binary-tree/description/
 * #110
 */
public class BalancedBinaryTree {
    /**
     * Initialize new Binary Binary Tree problem solver
     */
    public BalancedBinaryTree() {
    }

    /**
     * Given a binary tree, determine if it is height-balanced.
     * 
     * A heigh-balanced binary tree is a binary tree which the depth of the two
     * subtrees of every node never differs by more than one.
     * 
     * Constraints:
     * 
     * The number of nodes in the tree is in the range [0, 5000].
     * -10^4 <= Node.val <= 10^4
     * 
     * @param root
     *            - tree's root
     * @return true if tree is balanced, otherwise false
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        int left = subBalanced(root.left);
        int right = subBalanced(root.right);
        if (left < 0 || right < 0)
            return false;
        return Math.abs(left - right) < 2;
    }

    private int subBalanced(TreeNode node) {
        if (node == null)
            return 0;
        int left = 1 + subBalanced(node.left);
        if (left == 0)
            return -1;
        int right = 1 + subBalanced(node.right);
        if (right == 0)
            return -1;
        if (Math.abs(left - right) > 1)
            return -1;
        return Math.max(left, right);
    }
}
