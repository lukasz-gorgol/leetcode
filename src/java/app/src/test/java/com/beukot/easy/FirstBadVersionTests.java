package com.beukot.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FirstBadVersionTests {
    private final FirstBadVersion problem = new FirstBadVersion();
    private final int[] arr = new int[] { 1, 1, 1, 1, 0, 0 };

    @Test
    void standardAssertions() {
        problem.setVersions(arr);
        assertEquals(4, problem.firstBadVersion(5));
    }
}
