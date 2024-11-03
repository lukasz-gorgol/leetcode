package com.beukot.components;

import com.beukot.easy.MergeTwoSortedLists;

public class ListNodeHelper {
    /*
     * helper to convert int array to ListNode
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

    /*
     * helper to convert int array to ListNode
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

    /*
     * Unit test helper method to create listnode from int array, call
     * mergeTwoLists,
     * convert ListNode to int[] and return it
     */
    public int[] mergeTwoListsAsArray(int[] list1, int[] list2) {
        return listNodetoArray(
                new MergeTwoSortedLists().mergeTwoLists(arraytoListNode(list1), arraytoListNode(list2)));
    }
}
