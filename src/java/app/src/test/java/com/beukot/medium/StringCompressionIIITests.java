package com.beukot.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringCompressionIIITests {
    public final StringCompressionIII problem = new StringCompressionIII();

    @Test
    void standardAssertions() {
        assertEquals("1a1b1c1d1e", problem.compressedString("abcde"));
        assertEquals("9a5a2b", problem.compressedString("aaaaaaaaaaaaaabb"));
    }
}
