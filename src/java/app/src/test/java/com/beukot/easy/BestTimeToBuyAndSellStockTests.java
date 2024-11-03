package com.beukot.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockTests {
    private final BestTimeToBuyAndSellStock problem = new BestTimeToBuyAndSellStock();

    @Test
    void standardAssertions() {
        assertEquals(5, problem.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
        assertEquals(0, problem.maxProfit(new int[] { 7, 6, 4, 3, 1 }));
    }
}
