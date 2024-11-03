package com.beukot.easy;

/* 
 * Valid Anagram
 * https://leetcode.com/problems/valid-anagram/description/
 * #242
 */
public class ValidAnagram {
    /*
     * Given two strings s and t, return true if t is an anagram of s, and false
     * otherwise.
     */
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null)
            return false;
        int len = s.length();
        if (len == 0 || t.length() != len)
            return false;

        int[] stab = new int[122 - 97 + 1];
        int[] ttab = new int[122 - 97 + 1];

        for (int i = 0; i < 26; i++) {
            stab[i] = 0;
            ttab[i] = 0;
        }

        for (int i = 0; i < len; i++) {
            stab[s.charAt(i) - 97]++;
            ttab[t.charAt(i) - 97]++;
        }

        for (int i = 0; i < 26; i++)
            if (stab[i] != ttab[i])
                return false;

        return true;
    }
}
