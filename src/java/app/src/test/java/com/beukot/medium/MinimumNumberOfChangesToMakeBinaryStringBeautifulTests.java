package com.beukot.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MinimumNumberOfChangesToMakeBinaryStringBeautifulTests {
    public final MinimumNumberOfChangesToMakeBinaryStringBeautiful problem = new MinimumNumberOfChangesToMakeBinaryStringBeautiful();

    @Test
    void standardAssertions() {
        assertEquals(2, problem.minChanges("1001"));
        assertEquals(1, problem.minChanges("10"));
        assertEquals(0, problem.minChanges("0000"));
    }

}
