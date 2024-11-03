package com.beukot.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CircularSentenceTests {
    private final CircularSentence problem = new CircularSentence();

    @Test
    void standardAssertions() {
        assertEquals(true, problem.isCircularSentence("leetcode exercises sound delightful"));
        assertEquals(true, problem.isCircularSentence("eetcode"));
        assertEquals(false, problem.isCircularSentence("Leetcode is cool"));
    }
}
