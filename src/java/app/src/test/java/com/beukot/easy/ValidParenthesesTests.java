package com.beukot.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ValidParenthesesTests {
    private final ValidParentheses problem = new ValidParentheses();

    @Test
    void standardAssertions() {
        assertEquals(true, problem.isValid("()"));
        assertEquals(true, problem.isValid("()[]{}"));
        assertEquals(false, problem.isValid("(]"));
        assertEquals(true, problem.isValid("([])"));
    }
}
