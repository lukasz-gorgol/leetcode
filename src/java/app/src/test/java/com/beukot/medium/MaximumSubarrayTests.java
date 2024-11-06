package com.beukot.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaximumSubarrayTests {
    public final MaximumSubarray problem = new MaximumSubarray();

    private final int[][] arr = new int[][] {
            { -2, 1, -3, 4, -1, 2, 1, -5, 4 },
            { 1 },
            { 5, 4, -1, 7, 8 }
    };
    private final int[] result = new int[] { 6, 1, 23 };

    @Test
    void standardAssertions() {
        assertEquals(result[0], problem.maxSubArray(arr[0]));
        assertEquals(result[1], problem.maxSubArray(arr[1]));
        assertEquals(result[2], problem.maxSubArray(arr[2]));
    }
}
