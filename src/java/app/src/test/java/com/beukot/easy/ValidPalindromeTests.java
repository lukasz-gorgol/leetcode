package com.beukot.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTests {
    private final ValidPalindrome problem = new ValidPalindrome();

    @Test
    void standardAssertions() {
        assertEquals(true, problem.isPalindrome("A man, a plan, a canal: Panama"));
        assertEquals(false, problem.isPalindrome("race a car"));
        assertEquals(true, problem.isPalindrome(" "));
    }
}
