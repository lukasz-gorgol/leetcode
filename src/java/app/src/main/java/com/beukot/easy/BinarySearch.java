package com.beukot.easy;

/**
 * Binary Search
 * https://leetcode.com/problems/binary-search/description/
 * #704
 */
public class BinarySearch {
    /**
     * Initialize new Binary Search problem solver
     */
    public BinarySearch() {
    }

    /**
     * Given an array of integers nums which is sorted in ascending order, and an
     * integer target, write a function to search target in nums. If target exists,
     * then return its index. Otherwise, return -1.
     * 
     * You must write an algorithm with O(log n) runtime complexity.
     * 
     * @param nums array sorted in ascending order
     * @param target target
     * @return int target index if it exists or -1
     */
    public int search(int[] nums, int target) {
        if (nums == null)
            return -1;
        int r = nums.length - 1;
        if (r == -1)
            return -1;
        int l = 0;

        int m = (r + l) / 2;
        int v;
        while (true) {
            v = nums[m];
            if (v == target)
                return m;
            if (l >= r)
                return -1;
            if (v < target) {
                if (l == m)
                    l = m + 1;
                else
                    l = m;
            } else {
                if (r == m)
                    r = m - 1;
                else
                    r = m;
            }
            m = (r + l) / 2;
        }
    }
}
