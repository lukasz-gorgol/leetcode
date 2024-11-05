package com.beukot.easy;

/**
 * First Bad Version
 * https://leetcode.com/problems/first-bad-version/description/
 * #278
 */
public class FirstBadVersion {
    /**
     * Initialize new First Bad Version problem solver
     */
    public FirstBadVersion() {
    }

    /**
     * You are a product manager and currently leading a team to develop a new
     * product. Unfortunately, the latest version of your product fails the quality
     * check. Since each version is developed based on the previous version, all the
     * versions after a bad version are also bad.
     * 
     * Suppose you have n versions [1, 2, ..., n] and you want to find out the first
     * bad one, which causes all the following ones to be bad.
     * 
     * You are given an API bool isBadVersion(version) which returns whether version
     * is bad. Implement a function to find the first bad version. You should
     * minimize the number of calls to the API.
     * 
     * Constraints:
     * 
     * 1 <= bad <= n <= 231 - 1
     * 
     * The isBadVersion API is defined in the parent class VersionControl.
     * boolean isBadVersion(int version);
     * 
     * @param n
     *            - version to check
     * @return first bad version
     */

    private int[] arr = new int[] {};

    /**
     * Returns true f given varsion is bad
     * 
     * @param n - version number to check
     * @return true if bad version
     */
    private boolean isBadVersion(int n) {
        return arr[n] == 0;
    }

    /**
     * Set versions array for inner check using isBadVersion method
     * 
     * @param v - versions array to store
     */
    public void setVersions(int[] v) {
        arr = v;
    }

    /**
     * Find first bad version
     * 
     * @param n - latest version to check
     * @return first bad version number
     */
    public int firstBadVersion(int n) {
        int min = 0;
        int max = n;
        int mid = min + (max - min) / 2;
        if (!isBadVersion(n))
            return n;
        while (min != max) {
            if (min + 1 == max) {
                if (isBadVersion(min))
                    return min;
                else
                    return max;
            }
            mid = min + (max - min) / 2;
            if (isBadVersion(mid)) {
                max = mid;
            } else {
                min = mid;
            }
        }
        return mid;
    }
}
