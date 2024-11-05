package com.beukot.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.beukot.components.ListNodeHelper;

public class LinkedListCycleTests {
    private final LinkedListCycle problem = new LinkedListCycle();
    private final ListNodeHelper helper = new ListNodeHelper();

    private final int[] arr0 = new int[] {3,2,0,-4,2};
    private final int[] arr1 = new int[] {1,2,1};
    private final int[] arr2 = new int[] {1};

    @Test
    void standardAssertions() {
        assertEquals(true, problem.hasCycle(helper.arrayToUniqueListNode(arr0)));
        assertEquals(true, problem.hasCycle(helper.arrayToUniqueListNode(arr1)));
        assertEquals(false, problem.hasCycle(helper.arrayToUniqueListNode(arr2)));
    }
}
