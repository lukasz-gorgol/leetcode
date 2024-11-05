package com.beukot.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.beukot.components.ListNodeHelper;

public class MergeTwoSortedListsTests {
    private final MergeTwoSortedLists problem = new MergeTwoSortedLists();
    private final ListNodeHelper helper = new ListNodeHelper();

    @Test
    void standardAssertions() {
        assertArrayEquals(new int[] { 1, 1, 2, 3, 4, 4 },
                helper.listNodeToArray(
                        problem.mergeTwoLists(
                                helper.arrayToListNode(new int[] { 1, 2, 4 }),
                                helper.arrayToListNode(new int[] { 1, 3, 4 }))));

        assertArrayEquals(new int[] {}, helper.listNodeToArray(
                problem.mergeTwoLists(
                        helper.arrayToListNode(new int[] {}),
                        helper.arrayToListNode(new int[] {}))));

        assertArrayEquals(new int[] { 0 }, helper.listNodeToArray(
                problem.mergeTwoLists(
                        helper.arrayToListNode(new int[] {}),
                        helper.arrayToListNode(new int[] { 0 }))));
    }
}
