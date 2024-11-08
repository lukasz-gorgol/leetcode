package com.beukot.easy;

/**
 * Circular Sentence
 * https://leetcode.com/problems/circular-sentence/description/
 * #2490
 */
public class CircularSentence {
    /**
     * Initialize new Circular Sentence problem solver
     */
    public CircularSentence() {
    }

    /**
     * A sentence is a list of words that are separated by a single space
     * with no leading or trailing spaces.
     * 
     * For example, "Hello World", "HELLO", "hello world hello world" are all
     * sentences.
     * 
     * Words consist of only uppercase and lowercase English letters. Uppercase
     * and lowercase English letters are considered different.
     * 
     * A sentence is circular if:
     * 
     * The last character of a word is equal to the first character of the next
     * word.
     * The last character of the last word is equal to the first character of the
     * first word.
     * 
     * For example, "leetcode exercises sound delightful", "eetcode", "leetcode eats
     * soul"
     * are all circular sentences. However, "Leetcode is cool", "happy Leetcode",
     * "Leetcode" and "I like Leetcode" are not circular sentences.
     * 
     * Given a string sentence, return true if it is circular. Otherwise, return
     * false.
     * 
     * @param sentence
     *            - list of words separated by single space with no leading or
     *            trailing spaces
     * @return true if sentence is circular, otherwise false
     */
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].charAt(words[i].length() - 1) != words[(i + 1) % words.length].charAt(0)) {
                return false;
            }
        }
        return true;
    }
}
