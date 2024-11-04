package com.beukot.easy;

import java.util.Hashtable;

/**
 * Two Sum
 * https://leetcode.com/problems/two-sum/description/
 * #1
 * 
 */
public class TwoSum {
    /**
     * Initialize new Two Sum problem solver
     */

    public TwoSum() {
    }

    /**
     * Given an array of integers nums and an integer target, return indices
     * of the two numbers such that they add up to target.
     * 
     * You may assume that each input would have exactly one solution, and you
     * may not use the same element twice.
     * 
     * You can return the answer in any order.
     * 
     * @param nums
     *            - array of integers
     * @param target
     *            - integer target
     * @return indices of the two numbers such that they add up to target
     */
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> found = new Hashtable<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (found.containsKey(target - nums[i])) {
                return new int[] { found.get(target - nums[i]), i };
            }
            found.put(nums[i], i);
        }
        return new int[] {};
    }
}
