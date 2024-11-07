package com.beukot.medium;

import java.util.ArrayList;

/**
 * Insert Interval
 * https://leetcode.com/problems/insert-interval/description/
 * #57
 */
public class InsertInterval {
    /**
     * Initialize new Insert Interval problem solver
     */
    public InsertInterval() {
    }

    /**
     * You are given an array of non-overlapping intervals intervals where
     * intervals[i] = [starti, endi] represent the start and the end of the ith
     * interval and intervals is sorted in ascending order by starti. You are also
     * given an interval newInterval = [start, end] that represents the start and
     * end of another interval.
     * 
     * Insert newInterval into intervals such that intervals is still sorted in
     * ascending order by starti and intervals still does not have any overlapping
     * intervals (merge overlapping intervals if necessary).
     * 
     * Return intervals after the insertion.
     * 
     * Note that you don't need to modify intervals in-place. You can make a new
     * array and return it.
     *
     * Constraints:
     * 
     * 0 <= intervals.length <= 10^4
     * intervals[i].length == 2
     * 0 <= starti <= endi <= 10^5
     * intervals is sorted by starti in ascending order.
     * newInterval.length == 2
     * 0 <= start <= end <= 10^5
     * 
     * @param intervals
     *            - array of non-overlapping intervals intervals
     * @param newInterval
     *            - interval to be inserted
     * @return intervals after the insertion
     */
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (newInterval == null || intervals == null)
            return intervals;
        ArrayList<Integer> result = new ArrayList<>();

        boolean foundStart = false;
        boolean foundEnd = false;
        for (int i = 0; i < intervals.length; i++) {
            if (!foundStart) {
                if (newInterval[0] < intervals[i][0]) {
                    foundStart = true;
                    result.add(newInterval[0]);
                    if (newInterval[1] < intervals[i][0]) {
                        foundEnd = true;
                        result.add(newInterval[1]);
                        result.add(intervals[i][0]);
                        result.add(intervals[i][1]);
                    } else if (newInterval[1] <= intervals[i][1]) {
                        foundEnd = true;
                        result.add(intervals[i][1]);
                    }
                } else if (newInterval[0] <= intervals[i][1]) {
                    foundStart = true;
                    result.add(intervals[i][0]);
                    if (newInterval[1] <= intervals[i][1]) {
                        foundEnd = true;
                        result.add(intervals[i][1]);
                    }
                } else {
                    result.add(intervals[i][0]);
                    result.add(intervals[i][1]);
                }
            } else if (!foundEnd) {
                if (newInterval[1] < intervals[i][0]) {
                    foundEnd = true;
                    result.add(newInterval[1]);
                    result.add(intervals[i][0]);
                    result.add(intervals[i][1]);
                } else if (newInterval[1] <= intervals[i][1]) {
                    foundEnd = true;
                    result.add(intervals[i][1]);
                }
            } else {
                result.add(intervals[i][0]);
                result.add(intervals[i][1]);
            }
        }

        if (!foundStart) {
            result.add(newInterval[0]);
            result.add(newInterval[1]);
        } else if (!foundEnd) {
            result.add(newInterval[1]);
        }

        int[][] arr = new int[result.size() / 2][];
        for (int i = 0; i < result.size() - 1; i += 2) {
            arr[i / 2] = new int[] { result.get(i), result.get(i + 1) };
        }
        return arr;
    }
}
