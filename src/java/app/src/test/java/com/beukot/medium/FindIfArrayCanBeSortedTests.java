package com.beukot.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FindIfArrayCanBeSortedTests {
    private final FindIfArrayCanBeSorted problem = new FindIfArrayCanBeSorted();

    private final int[][] input = {
            { 8, 4, 2, 30, 15 },
            { 1, 2, 3, 4, 5 },
            { 3, 16, 8, 4, 2 }
    };
    private final boolean[] result = { true, true, false };

    @Test
    void standardAssertions() {
        assertEquals(result[0], problem.canSortArray(input[0]));
        assertEquals(result[1], problem.canSortArray(input[1]));
        assertEquals(result[2], problem.canSortArray(input[2]));
    }
}
