package com.beukot.medium;

/**
 * Minimum Array End
 * https://leetcode.com/problems/minimum-array-end/description/
 * #3133
 */
public class MinimumArrayEnd {
    /**
     * Initialize new Minimum Array End problem solver
     */
    public MinimumArrayEnd() {
    }

    /**
     * You are given two integers n and x. You have to construct an array of
     * positive integers nums of size n where for every 0 <= i < n - 1, nums[i + 1]
     * is greater than nums[i], and the result of the bitwise AND operation between
     * all elements of nums is x.
     * 
     * Return the minimum possible value of nums[n - 1].
     * 
     * Constraints:
     * 
     * 1 <= n, x <= 10^8
     * 
     * @param n
     *            - size of an array of increasing integers to construct
     * @param x
     *            - bitwise AND between all elements of nums
     * @return the minimum possible value of nums[n-1]
     */
    public long minEnd(int n, int x) {
        long stack = 0;
        long result = 0;
        int leadingZeros = 0;

        if(n == 1) return x;
        n -= 1;
        while (n > 0) {
            stack <<= 1;
            if ((x & 1) == 1) {
                stack += 1;
                x >>= 1;
            } else {
                if ((n & 1) == 1) {
                    stack += 1;
                } else {
                    if (stack == 0)
                        leadingZeros++;
                }
                n >>= 1;
                x >>= 1;
            }
        }
        while (x > 0) {
            stack <<= 1;
            if ((x & 1) == 1) {
                stack += 1;
            }
            x >>= 1;
        }
        while (stack > 0) {
            result <<= 1;
            result += (stack & 1);
            stack >>= 1;
        }
        result <<= leadingZeros;
        return result;
    }
}
