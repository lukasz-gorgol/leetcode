package com.beukot.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BinarySearchTests {
    private final BinarySearch problem = new BinarySearch();

    @Test
    void standardAssertions() {
        assertEquals(1, problem.search(new int[] { 2, 5 }, 5));
        assertEquals(4, problem.search(new int[] { -1, 0, 3, 5, 9, 12 }, 9));
        assertEquals(-1, problem.search(new int[] { -1, 0, 3, 5, 9, 12 }, 2));
    }
}
