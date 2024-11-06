package com.beukot.easy;

/**
 * Ransom Note
 * https://leetcode.com/problems/ransom-note/description/
 * #383
 */
public class RansomNote {
    /**
     * Initialize new Ransom Note problem solver
     */
    public RansomNote() {
    }

    /**
     * Given two strings ransomNote and magazine, return true if ransomNote can be
     * constructed by using the letters from magazine and false otherwise.
     * 
     * Each letter in magazine can only be used once in ransomNote.
     * 
     * Constraints:
     * 1 <= ransomNote.length, magazine.length <= 105
     * ransomNote and magazine consist of lowercase English letters.
     * 
     * @param ransomNote
     *            - target string
     * @param magazine
     *            - source string
     * @return true if ransomNote can be cuonstructed using the letters from
     *         magazine, otherwise false
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] src = new int[26];
        for (int i = src.length - 1; i >= 0; i--)
            src[i] = 0;

        int len;
        len = magazine.length();
        for (int i = 0; i < len; i++)
            src[magazine.charAt(i) - 97]++;
        len = ransomNote.length();
        for (int i = 0; i < len; i++)
            src[ransomNote.charAt(i) - 97]--;
        len = src.length;
        for (int i = 0; i < len; i++)
            if (src[i] < 0)
                return false;
        return true;
    }
}