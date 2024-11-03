package com.beukot.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RotateStringTests {
    private final RotateString problem = new RotateString();

    @Test
    void standardAssertions() {
        assertEquals(true, problem.rotateString("abcde", "cdeab"));
        assertEquals(false, problem.rotateString("abcde", "abced"));
    }
}
