package com.beukot.easy;

import java.util.Stack;

/**
 * Implement Queue using Stacks
 * https://leetcode.com/problems/implement-queue-using-stacks/description/
 * #232
 * 
 * MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 * 
 * Implement a first in first out (FIFO) queue using only two stacks. The
 * implemented queue should support all the functions of a normal queue (push,
 * peek, pop, and empty).
 * 
 * Implement the MyQueue class:
 * 
 * void push(int x) Pushes element x to the back of the queue.
 * int pop() Removes the element from the front of the queue and returns it.
 * int peek() Returns the element at the front of the queue.
 * boolean empty() Returns true if the queue is empty, false otherwise.
 * 
 * Notes:
 * 
 * You must use only standard operations of a stack, which means only push to
 * top, peek/pop from top, size, and is empty operations are valid.
 * Depending on your language, the stack may not be supported natively. You may
 * simulate a stack using a list or deque (double-ended queue) as long as you
 * use only a stack's standard operations.
 * 
 * Constraints:
 * 
 * 1 <= x <= 9
 * At most 100 calls will be made to push, pop, peek, and empty.
 * All the calls to pop and peek are valid.
 * 
 * Follow-up: Can you implement the queue such that each operation is amortized
 * O(1) time complexity? In other words, performing n operations will take
 * overall O(n) time even if one of those operations may take longer.
 */
public class MyQueue {
    private Stack<Integer> stack;

    /**
     * Initialize new MyQueue
     */
    public MyQueue() {
        stack = new Stack<>();
    }

    /**
     * push element x to the back of the queue
     * 
     * @param x
     *            - element to be pushed
     */
    public void push(int x) {
        stack.push(x);
    }

    /**
     * Removes the element from the front of the queue and returns it
     * 
     * @return element from the front of the queue
     */
    public int pop() {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty())
            temp.push(stack.pop());
        int response = temp.pop();
        while (!temp.isEmpty())
            stack.push(temp.pop());
        return response;
    }

    /**
     * Returns the element at the front of the queue
     * 
     * @return the element at the front of the queue
     */
    public int peek() {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty())
            temp.push(stack.pop());
        int response = temp.peek();
        while (!temp.isEmpty())
            stack.push(temp.pop());
        return response;
    }

    /**
     * Returns true if the queue is empty, false otherwise
     * 
     * @return true if the queue is empty, otherwise false
     */
    public boolean empty() {
        return stack.empty();
    }
}
