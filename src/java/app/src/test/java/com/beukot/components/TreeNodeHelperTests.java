package com.beukot.components;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class TreeNodeHelperTests {
    private final TreeNodeHelper helper = new TreeNodeHelper();

    private final int[] arr0 = new int[] {};
    private final int[] arr1 = new int[] { 2, 1 };
    private final int[] arr2 = new int[] { 2, 1, 3 };
    private final int[] arr3 = new int[] { 4, 2, 7, 1, 3, 6, 9 };
    private final int[] arr4 = new int[] { 6, 2, 8, 0, 4, 7, 9, Integer.MIN_VALUE, Integer.MIN_VALUE, 3, 5 };
    private final int[] arr5 = new int[] { 1, 2, Integer.MIN_VALUE, 3, Integer.MIN_VALUE, 4, Integer.MIN_VALUE, 5 };

    @Test
    void standardAssertions() {
        assertEquals(0, helper.treeSize(helper.arrayToTreeNode(arr0)));
        assertEquals(2, helper.treeSize(helper.arrayToTreeNode(arr1)));
        assertEquals(3, helper.treeSize(helper.arrayToTreeNode(arr2)));
        assertEquals(7, helper.treeSize(helper.arrayToTreeNode(arr3)));
        assertEquals(11, helper.treeSize(helper.arrayToTreeNode(arr4)));

        assertEquals(6, helper.findNode(helper.arrayToTreeNode(arr4), 6).val);
        assertEquals(2, helper.findNode(helper.arrayToTreeNode(arr4), 2).val);
        assertEquals(4, helper.findNode(helper.arrayToTreeNode(arr4), 4).val);
        assertEquals(3, helper.findNode(helper.arrayToTreeNode(arr4), 3).val);
        assertEquals(5, helper.findNode(helper.arrayToTreeNode(arr4), 5).val);
        assertEquals(7, helper.findNode(helper.arrayToTreeNode(arr4), 7).val);
        assertEquals(9, helper.findNode(helper.arrayToTreeNode(arr4), 9).val);

        assertArrayEquals(arr0, helper.treeNodeToArray(helper.arrayToTreeNode(arr0)));
        assertArrayEquals(arr1, helper.treeNodeToArray(helper.arrayToTreeNode(arr1)));
        assertArrayEquals(arr2, helper.treeNodeToArray(helper.arrayToTreeNode(arr2)));
        assertArrayEquals(arr3, helper.treeNodeToArray(helper.arrayToTreeNode(arr3)));
        assertArrayEquals(arr4, helper.treeNodeToArray(helper.arrayToTreeNode(arr4)));
        assertArrayEquals(arr5, helper.treeNodeToArray(helper.arrayToTreeNode(arr5)));
    }
}
