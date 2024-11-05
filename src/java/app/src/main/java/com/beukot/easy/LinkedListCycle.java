package com.beukot.easy;

import com.beukot.components.ListNode;

/**
 * Linked List Cycle
 * https://leetcode.com/problems/linked-list-cycle/description/
 * #141
 */
public class LinkedListCycle {
    /**
     * Initialize new Linked List Cycle problem solver
     */
    public LinkedListCycle() {
    }

    /**
     * Given head, the head of a linked list, determine if the linked list has a
     * cycle in it.
     * 
     * There is a cycle in a linked list if there is some node in the list that can
     * be reached again by continuously following the next pointer. Internally, pos
     * is used to denote the index of the node that tail's next pointer is connected
     * to. Note that pos is not passed as a parameter.
     * 
     * Return true if there is a cycle in the linked list. Otherwise, return false.
     * 
     * Constraints:
     * 
     * The number of the nodes in the list is in the range [0, 104].
     * -105 <= Node.val <= 105
     * pos is -1 or a valid index in the linked-list.
     * 
     * Follow up: Can you solve it using O(1) (i.e. constant) memory?
     * 
     * @param head
     *            - the head of linked list
     * @return true if there is a cycle in the linked list, otherwise false
     */
    public boolean hasCycle(ListNode head) {
        while (head != null) {
            if(head.val == Integer.MIN_VALUE) return true;
            head.val = Integer.MIN_VALUE;
            head = head.next;
        }
        return false;
    }
}
