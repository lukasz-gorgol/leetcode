package com.beukot.easy;

/* 
 * Valid Palindrome
 * https://leetcode.com/problems/valid-palindrome/description/
 * #125
 */
public class ValidPalindrome {
    /*
     * A phrase is a palindrome if, after converting all uppercase letters
     * into lowercase letters and removing all non-alphanumeric characters,
     * it reads the same forward and backward. Alphanumeric characters include
     * letters and numbers.
     * 
     * Given a string s, return true if it is a palindrome, or false otherwise.
     */
    public boolean isPalindrome(String s) {
        if (s == null)
            return true;
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (s.isEmpty())
            return true;
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;
    }
}
