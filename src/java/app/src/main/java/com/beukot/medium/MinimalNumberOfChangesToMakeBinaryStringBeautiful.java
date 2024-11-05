package com.beukot.medium;

/**
 * Minimal Number of Changes to Make Binary String Beautiful
 * https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful/description/
 * #2914
 */
public class MinimalNumberOfChangesToMakeBinaryStringBeautiful {
    /**
     * Initialize new Minimal Number of Changes to Make Binary String Beautiful
     * problem solver
     */
    public MinimalNumberOfChangesToMakeBinaryStringBeautiful() {
    }

    /**
     * You are given a 0-indexed binary string s having an even length.
     * 
     * A string is beautiful if it's possible to partition it into one or more
     * substrings such that:
     * 
     * Each substring has an even length.
     * Each substring contains only 1's or only 0's.
     * 
     * You can change any character in s to 0 or 1.
     * 
     * Return the minimum number of changes required to make the string s beautiful.
     * 
     * @param s
     *            - 0-indexed binary string having an even length
     * @return the minimum number of changes required to make the string s beautiful
     */
    public int minChanges(String s) {
        if (s == null || s.length() == 0 || s.length() % 2 != 0)
            return 0;
        int changes = 0;
        for (int i = s.length() - 2; i >= 0; i -= 2) {
            if (s.charAt(i) != s.charAt(i + 1))
                changes++;
        }
        return changes;
    }
}
