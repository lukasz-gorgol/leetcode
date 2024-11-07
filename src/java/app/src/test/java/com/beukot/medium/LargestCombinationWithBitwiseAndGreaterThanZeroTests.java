package com.beukot.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LargestCombinationWithBitwiseAndGreaterThanZeroTests {
    private final LargestCombinationWithBitwiseAndGreaterThanZero problem = new LargestCombinationWithBitwiseAndGreaterThanZero();

    private final int[][] input = {
            { 16,17,71,62,12,24,14 },
            { 8, 8 }
    };
    private final int[] result = { 4, 2 };

    @Test
    void standardAssertions() {
        assertEquals(result[0], problem.largestCombination(input[0]));
        assertEquals(result[1], problem.largestCombination(input[1]));
    }
}
