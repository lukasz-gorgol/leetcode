package com.beukot.medium;

/**
 * Largest Combination with Bitwise and Greater than Zero
 * https://leetcode.com/problems/largest-combination-with-bitwise-and-greater-than-zero/description/
 * #2275
 */
public class LargestCombinationWithBitwiseAndGreaterThanZero {
    /**
     * Initialize new Largest Combination with Bitwise and Greater than Zero problem
     * solver
     */
    public LargestCombinationWithBitwiseAndGreaterThanZero() {
    }

    /**
     * The bitwise AND of an array nums is the bitwise AND of all integers in nums.
     * 
     * For example, for nums = [1, 5, 3], the bitwise AND is equal to 1 & 5 & 3 = 1.
     * Also, for nums = [7], the bitwise AND is 7.
     * 
     * You are given an array of positive integers candidates. Evaluate the bitwise
     * AND of every combination of numbers of candidates. Each number in candidates
     * may only be used once in each combination.
     * 
     * Return the size of the largest combination of candidates with a bitwise AND
     * greater than 0.
     * 
     * Constraints:
     * 
     * 1 <= candidates.length <= 10^5
     * 1 <= candidates[i] <= 10^7
     * 
     * @param candidates
     *            - an array of positive integers candidates
     * @return the size of the largest combination of candidates with a bitwise AND
     *         greater than 0
     */
    public int largestCombination(int[] candidates) {
        if (candidates == null || candidates.length == 0)
            return 0;
        int max = 0;
        for (int i = 0; i < 24; i++) {
            int curr = 0;
            for (int c : candidates) {
                if ((c & (1 << i)) != 0)
                    curr++;
            }
            if (curr > max)
                max = curr;
        }
        return max;
    }
}
