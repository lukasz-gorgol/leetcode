package com.beukot.medium;

/**
 * Find if Array Can Be Sorted
 * https://leetcode.com/problems/find-if-array-can-be-sorted/description/
 * #3011
 */
public class FindIfArrayCanBeSorted {
    /**
     * Initialize new Find if Array Can Be Sorted problem solver
     */
    public FindIfArrayCanBeSorted() {
    }

    /**
     * You are given a 0-indexed array of positive integers nums.
     * 
     * In one operation, you can swap any two adjacent elements if they have the
     * same number of set bits. You are allowed to do this operation any number of
     * times (including zero).
     * 
     * Return true if you can sort the array, else return false.
     * 
     * Constraints:
     * 
     * 1 <= nums.length <= 100
     * 1 <= nums[i] <= 2^8
     * 
     * @param nums
     * @return
     */
    public boolean canSortArray(int[] nums) {
        if (nums == null)
            return true;
        int len = nums.length;
        if (len < 2)
            return true;
        int[] bits = new int[257];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (bits[nums[i]] == 0) {
                int k = nums[i];
                while (k > 0) {
                    if (k != (k & 510))
                        bits[nums[i]]++;
                    k >>= 1;
                }
            }
        }

        int groupMin[] = new int[len];
        int groupMax[] = new int[len];
        int groupBits[] = new int[len];
        int groups = 0;

        for (int i = len - 1; i > 0; i--)
            groupMin[i] = Integer.MAX_VALUE;

        int n = nums[0];
        groupBits[0] = bits[n];
        groupMin[0] = n;
        groupMax[0] = n;

        int ptr = 1;
        while (ptr < len) {
            n = nums[ptr];
            if (bits[n] == groupBits[groups]) {
                if (n < groupMin[groups])
                    groupMin[groups] = n;
                if (n > groupMax[groups])
                    groupMax[groups] = n;
            } else {
                groupBits[++groups] = bits[n];
                groupMin[groups] = n;
                groupMax[groups] = n;
            }
            ptr++;
        }

        while(groups > 0) {
            if(groupMax[groups-1] > groupMin[groups]) return false;
            groups--;
        }
        return true;
    }
}
