package com.beukot.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import com.beukot.components.TreeNodeHelper;

public class InvertBinaryTreeTests {
    private final InvertBinaryTree problem = new InvertBinaryTree();
    private final TreeNodeHelper helper = new TreeNodeHelper();

    @Test
    void standardAssertions() {
        assertArrayEquals(new int[] { 4, 7, 2, 9, 6, 3, 1 },
                helper.treeNodeToArray(
                        problem.invertTree(
                                helper.arrayToTreeNode(new int[] { 4, 2, 7, 1, 3, 6, 9 }))));
        assertArrayEquals(new int[] { 2, 3, 1 },
                helper.treeNodeToArray(problem.invertTree(helper.arrayToTreeNode(new int[] { 2, 1, 3 }))));
        assertArrayEquals(new int[] {},
                helper.treeNodeToArray(problem.invertTree(helper.arrayToTreeNode(new int[] {}))));
    }
}
