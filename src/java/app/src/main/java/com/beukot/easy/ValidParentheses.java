package com.beukot.easy;

import java.util.Stack;

/*
 * Valid Parentheses
 * https://leetcode.com/problems/valid-parentheses/description/
 * #20
 */
public class ValidParentheses {
    /*
     * Given a string s containing just the characters '(', ')', '{', '}',
     * '[' and ']', determine if the input string is valid.
     * 
     * An input string is valid if:
     * 
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Every close bracket has a corresponding open bracket of the same type.
     * 
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c == '(') {
                stack.add((char) ((int) c + 1));
            } else if (c == '[' || c == '{') {
                stack.add((char) ((int) c + 2));
            } else {
                if (stack.isEmpty())
                    return false;
                if (stack.pop() != c)
                    return false;
            }
        }

        return stack.isEmpty();
    }
}
