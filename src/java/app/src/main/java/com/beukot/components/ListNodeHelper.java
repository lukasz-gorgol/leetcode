package com.beukot.components;

import java.util.HashMap;

import com.beukot.easy.MergeTwoSortedLists;

/**
 * List Node Helper class for List Node problems with arrays
 */
public class ListNodeHelper {
    /**
     * Helper to convert int array to ListNode
     * 
     * @param listArray
     *            - int array to be converted to list node
     * @return list node head
     */
    public ListNode arrayToListNode(int[] listArray) {
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
     * Helper to convert int array to ListNode where each value is unique so
     * repeating value is referenced from already instantiated List Node
     * 
     * @param listArray
     *            - int array to be converted to list node
     * @return list node head
     */
    public ListNode arrayToUniqueListNode(int[] listArray) {
        ListNode root = null;
        ListNode lastNode = null;
        HashMap<Integer, ListNode> map = new HashMap<>();
        if (listArray != null) {
            for (int i = 0; i < listArray.length; i++) {
                if (lastNode == null) {
                    root = new ListNode(listArray[i], null);
                    map.put(root.val, root);
                    lastNode = root;
                } else {
                    if (map.containsKey(listArray[i])) {
                        lastNode.next = map.get(listArray[i]);
                        lastNode = lastNode.next;
                    } else {
                        lastNode.next = new ListNode(listArray[i], null);
                        map.put(listArray[i], lastNode.next);
                        lastNode = lastNode.next;
                    }
                }
            }
        }
        return root;
    }

    /**
     * Helper to convert ListNode to int array
     * 
     * @param listNode
     *            - head of list node
     * @return int array
     */
    public int[] listNodeToArray(ListNode listNode) {
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
     * @param list1
     *            - first int array
     * @param list2
     *            - second int array
     * @return second int array merged after first
     */
    public int[] mergeTwoListsAsArray(int[] list1, int[] list2) {
        return listNodeToArray(
                new MergeTwoSortedLists().mergeTwoLists(arrayToListNode(list1), arrayToListNode(list2)));
    }
}
