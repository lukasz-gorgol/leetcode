package com.beukot.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.beukot.components.TreeNodeHelper;

public class BalancedBinaryTreeTests {
    private final BalancedBinaryTree problem = new BalancedBinaryTree();
    private final TreeNodeHelper helper = new TreeNodeHelper();

    private final int[] arr1 = new int[] { 3, 9, 20, Integer.MIN_VALUE, Integer.MIN_VALUE, 15, 7 };
    private final int[] arr2 = new int[] { 1, 2, 2, 3, 3, Integer.MIN_VALUE, Integer.MIN_VALUE, 4, 4 };
    private final int[] arr3 = new int[] {};
    private final int[] arr4 = new int[] { 1, 2, Integer.MIN_VALUE, 3, Integer.MIN_VALUE, 4, Integer.MIN_VALUE, 5 };

    @Test
    void standardAssertions() {
        assertEquals(true, problem.isBalanced(helper.arrayToTreeNode(arr1)));
        assertEquals(false, problem.isBalanced(helper.arrayToTreeNode(arr2)));
        assertEquals(true, problem.isBalanced(helper.arrayToTreeNode(arr3)));
        assertEquals(false, problem.isBalanced(helper.arrayToTreeNode(arr4)));
    }
}
