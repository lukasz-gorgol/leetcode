package com.beukot.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class InsertIntervalTests {
    public final InsertInterval problem = new InsertInterval();

    private final int[][][] arr0 = new int[][][] {
            { { 1, 3 }, { 6, 9 } },
            { { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, { 12, 16 } },
            { { 1, 5 } },
            { { 1, 5 } }
    };
    private final int[][] arr1 = new int[][] {
            { 2, 5 }, { 4, 8 }, { 5, 7 }, { 0, 3 }
    };
    private final int[][][] result = new int[][][] {
            { { 1, 5 }, { 6, 9 } },
            { { 1, 2 }, { 3, 10 }, { 12, 16 } },
            { { 1, 7 } },
            { { 0, 5 } }
    };

    @Test
    void standardAssertions() {
        assertArrayEquals(result[0], problem.insert(arr0[0], arr1[0]));
        assertArrayEquals(result[1], problem.insert(arr0[1], arr1[1]));
        assertArrayEquals(result[2], problem.insert(arr0[2], arr1[2]));
        assertArrayEquals(result[3], problem.insert(arr0[3], arr1[3]));
    }
}
