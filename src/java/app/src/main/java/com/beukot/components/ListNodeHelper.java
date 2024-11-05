package com.beukot.components;

import com.beukot.easy.MergeTwoSortedLists;

/**
 * List Node Helper class for List Node problems with arrays
 */
public class ListNodeHelper {
    /**
     * Helper to convert int array to ListNode
     * 
     * @param listArray - int array to be converted to list node
     * @return list node head
     */
    public ListNode arraytoListNode(int[] listArray) {
        ListNode root = null;
        ListNode lastNode = null;
        if (listArray != null) {
            for (int i = 0; i < listArray.length; i++) {
                if (lastNode == null) {
                    root = new ListNode(listArray[i], null);
                    lastNode = root;
                } else {
                    lastNode.next = new ListNode(listArray[i], null);
                    lastNode = lastNode.next;
                }
            }
        }
        return root;
    }

    /**
     * Helper to convert ListNode to int array
     * 
     * @param listNode - head of list node
     * @return int array
     */
    public int[] listNodetoArray(ListNode listNode) {
        int i = 0;
        ListNode ptr = listNode;
        while (ptr != null) {
            i++;
            ptr = ptr.next;
        }
        if (i == 0)
            return new int[] {};
        int[] arr = new int[i];
        i = 0;
        ptr = listNode;
        while (ptr != null) {
            arr[i++] = ptr.val;
            ptr = ptr.next;
        }
        return arr;
    }

    /**
     * Unit test helper method to create listnode from int array, call
     * mergeTwoLists,
     * convert ListNode to int[] and return it
     * 
     * @param list1 - first int array
     * @param list2 - second int array
     * @return second int array merged after first 
     */
    public int[] mergeTwoListsAsArray(int[] list1, int[] list2) {
        return listNodetoArray(
                new MergeTwoSortedLists().mergeTwoLists(arraytoListNode(list1), arraytoListNode(list2)));
    }
}
