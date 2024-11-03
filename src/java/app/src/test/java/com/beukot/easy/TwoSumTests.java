package com.beukot.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class TwoSumTests {
    private final TwoSum problem = new TwoSum();

    @Test
    void standardAssertions() {
        assertArrayEquals(new int[] { 0, 1}, problem.twoSum(new int[] { 2, 7, 11, 15 }, 9));
        assertArrayEquals(new int[] { 1, 2}, problem.twoSum(new int[] { 3, 2, 4 }, 6));
        assertArrayEquals(new int[] { 0, 1}, problem.twoSum(new int[] { 3, 3 }, 6));
    }
}
