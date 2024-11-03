package com.beukot.easy;

import com.beukot.components.ListNode;

/* 
 * Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 * #21
 */
public class MergeTwoSortedLists {
    /*
     * You are given the heads of two sorted linked lists list1 and list2.
     * 
     * Merge the two lists into one sorted list. The list should be made by splicing
     * together the nodes of the first two lists.
     * 
     * Return the head of the merged linked list.
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode root = null;
        ListNode last = null; 
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(ptr1.val < ptr2.val) {
            root = ptr1;
            ptr1 = ptr1.next;
        } else {
            root = ptr2;
            ptr2 = ptr2.next;
        }
        last = root;
        while(ptr1 != null || ptr2 != null) {
            if(ptr1 == null) {
                last.next = ptr2;
                ptr2 = null;
            } else if(ptr2 == null) {
                last.next = ptr1;
                ptr1 = null;
            } else if (ptr1.val < ptr2.val) {
                last.next = ptr1;
                ptr1 = ptr1.next;
            } else {
                last.next = ptr2;
                ptr2 = ptr2.next;
            }
            last = last.next;
        }
        
        return root;
    }
}
