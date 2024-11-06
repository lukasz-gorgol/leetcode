package com.beukot.medium;

/**
 * Maximum Subarray
 * https://leetcode.com/problems/maximum-subarray/
 * #53
 */
public class MaximumSubarray {
    /**
     * Initialize new Maximum Subarray problem solver
     */
    public MaximumSubarray() {
    }

    /**
     * Given an integer array nums, find the subarray with the largest sum, and
     * return its sum.
     * 
     * Constraints:
     * 
     * 1 <= nums.length <= 10^5
     * -10^4 <= nums[i] <= 10^4
     * 
     * Follow up: If you have figured out the O(n) solution, try coding another
     * solution using the divide and conquer approach, which is more subtle.
     * 
     * @param nums - integer array
     * @return sum of the largest subarray
     */
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int result = Integer.MIN_VALUE;
        int subresult = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++) {
            if(subresult < 0) subresult = 0;
            subresult += nums[i];
            if(subresult > result) result = subresult;
        }
        return result;
    }
}
