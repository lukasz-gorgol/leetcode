package com.beukot.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class FloodFillTests {
    public final FloodFill problem = new FloodFill();

    @Test
    void standardAssertions() {
        assertArrayEquals(new int[][] { { 2, 2, 2 }, { 2, 2, 0 }, { 2, 0, 1 } },
                problem.floodFill(new int[][] { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } }, 1, 1, 2));
        assertArrayEquals(new int[][] { { 0, 0, 0 }, { 0, 0, 0 } },
                problem.floodFill(new int[][] { { 0, 0, 0 }, { 0, 0, 0 } }, 0, 0, 0));
    }
}
