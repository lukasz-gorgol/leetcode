package com.beukot.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.beukot.components.TreeNode;
import com.beukot.components.TreeNodeHelper;

public class LowestCommonAncestorOfABinarySearchTreeTests {
    private final LowestCommonAncestorOfABinarySearchTree problem = new LowestCommonAncestorOfABinarySearchTree();
    private final TreeNodeHelper helper = new TreeNodeHelper();

    private final int[] arr1 = new int[] { 6, 2, 8, 0, 4, 7, 9, Integer.MIN_VALUE, Integer.MIN_VALUE, 3, 5 };
    private final int[] arr2 = new int[] { 2, 1 };

    @Test
    void standardAssertions() {
        TreeNode root;

        root = helper.arrayToTreeNode(arr1);
        assertEquals(6, problem.lowestCommonAncestor(
                root, helper.findNode(root, 2), helper.findNode(root, 8)).val);

        root = helper.arrayToTreeNode(arr1);
        assertEquals(2, problem.lowestCommonAncestor(
                root, helper.findNode(root, 2), helper.findNode(root, 4)).val);

        root = helper.arrayToTreeNode(arr2);
        assertEquals(2, problem.lowestCommonAncestor(
                root, helper.findNode(root, 2), helper.findNode(root, 1)).val);
    }
}
