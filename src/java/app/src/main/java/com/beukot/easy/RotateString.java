package com.beukot.easy;

/**
 * Rotate String
 * https://leetcode.com/problems/rotate-string/description/
 * #796
 */
public class RotateString {
    /**
     * Initialize new Rotate String problem solver
     */

    public RotateString() {
    }

    /**
     * Given two strings s and goal, return true if and only if s can become
     * goal after some number of shifts on s.
     * 
     * A shift on s consists of moving the leftmost character of s to the rightmost
     * position.
     * 
     * For example, if s = "abcde", then it will be "bcdea" after one shift.
     * 
     * @param s
     *            - source string
     * @param goal
     *            - goal string
     * @return true if s can become goal after some number of shits on s, otherwise
     *         false
     */
    public boolean rotateString(String s, String goal) {
        if (s == null && goal == null)
            return true;
        if (s == null || goal == null)
            return false;
        if (s.isEmpty() && goal.isEmpty())
            return true;
        if (s.isEmpty() || goal.isEmpty())
            return false;
        if (s.length() != goal.length())
            return false;

        int length = s.length();
        int s_start = 0;
        int g_index = 0;

        while (s_start < length) {
            while (g_index < length) {
                if (goal.charAt(g_index) != s.charAt((s_start + g_index) % length))
                    break;
                g_index++;
            }
            if (g_index == length)
                return true;
            g_index = 0;
            s_start++;
        }

        return false;
    }
}
