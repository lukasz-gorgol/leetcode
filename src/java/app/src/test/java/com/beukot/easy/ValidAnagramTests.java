package com.beukot.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ValidAnagramTests {
    private final ValidAnagram problem = new ValidAnagram();

    @Test
    void standardAssertions() {
        assertEquals(true, problem.isAnagram("anagram", "nagaram"));
        assertEquals(false, problem.isAnagram("rat", "car"));
    }
}
