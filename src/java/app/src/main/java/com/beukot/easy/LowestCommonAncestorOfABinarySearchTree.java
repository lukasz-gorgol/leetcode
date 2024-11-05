package com.beukot.easy;

import java.util.ArrayList;
import com.beukot.components.TreeNode;

/**
 * Lowest Common Ancestor of a Binary Search Tree
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * #235
 */
public class LowestCommonAncestorOfABinarySearchTree {
    /**
     * Initialize new Lowest Common Ancestor of a Binary Search Tree problem solver
     */
    public LowestCommonAncestorOfABinarySearchTree() {
    }

    /**
     * Given a binary search tree (BST), find the lowest common ancestor (LCA) node
     * of two given nodes in the BST.
     * 
     * According to the definition of LCA on Wikipedia: “The lowest common ancestor
     * is defined between two nodes p and q as the lowest node in T that has both p
     * and q as descendants (where we allow a node to be a descendant of itself).”
     * 
     * @param root
     *            - BST tree's root
     * @param p
     *            - node of BST
     * @param q
     *            - node of BST
     * @return LCA node
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> ap = new ArrayList<>();
        ArrayList<TreeNode> aq = new ArrayList<>();

        TreeNode n = root;
        while (n.val != p.val) {
            ap.add(n);
            if (n.val != p.val) {
                if (p.val < n.val)
                    n = n.left;
                else
                    n = n.right;
            }
        }
        ap.add(n);

        n = root;
        while (n.val != q.val) {
            aq.add(n);
            if (n.val != q.val) {
                if (q.val < n.val)
                    n = n.left;
                else
                    n = n.right;
            }
        }
        aq.add(n);

        int len = Math.min(ap.size(), aq.size());
        int i = 0;
        while (i < len - 1 && ap.get(i + 1).val == aq.get(i + 1).val) {
            i++;
        }

        return ap.get(i);
    }
}
