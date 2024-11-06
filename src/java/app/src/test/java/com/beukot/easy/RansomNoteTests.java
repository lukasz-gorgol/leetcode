package com.beukot.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RansomNoteTests {
    private final RansomNote problem = new RansomNote();

    @Test
    void standardAssertions() {
        assertEquals(false, problem.canConstruct("a", "b"));
        assertEquals(false, problem.canConstruct("aa", "ab"));
        assertEquals(true, problem.canConstruct("aa", "aab"));
    }
}