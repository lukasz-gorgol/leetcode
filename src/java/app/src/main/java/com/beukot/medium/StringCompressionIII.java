package com.beukot.medium;

/**
 * String Compression III
 * https://leetcode.com/problems/string-compression-iii/description/
 * #3163
 */
public class StringCompressionIII {
    /**
     * Initialize new String Sompression III problem solver
     */
    public StringCompressionIII() {
    }

    /**
     * Given a string word, compress it using the following algorithm:
     * 
     * Begin with an empty string comp. While word is not empty, use the following
     * operation:
     * Remove a maximum length prefix of word made of a single character c repeating
     * at most 9 times.
     * Append the length of the prefix followed by c to comp.
     * 
     * Return the string comp.
     * 
     * @param word
     *            - consists only of lowercase English letters
     * @return compressed word
     */
    public String compressedString(String word) {
        if (word == null || word.isEmpty())
            return word;
        char[] chars = word.toCharArray();
        int ptr = 0;
        int len = chars.length;
        int counter;
        StringBuilder response = new StringBuilder();
        while (ptr < len) {
            counter = 0;
            while (counter < 8 && ptr + counter + 1 < len && chars[ptr + counter] == chars[ptr + counter + 1])
                counter++;
            response.append(counter+1);
            response.append(chars[ptr]);
            ptr += counter + 1;
        }
        return response.toString();
    }
}
