package com.beukot.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinimumArrayEndTests {
    private final MinimumArrayEnd problem = new MinimumArrayEnd();

    @Test
    void standardAssertions() {
        assertEquals(6, problem.minEnd(3, 4));
        assertEquals(15, problem.minEnd(2, 7));
        assertEquals(2, problem.minEnd(1, 2));
    }
}
