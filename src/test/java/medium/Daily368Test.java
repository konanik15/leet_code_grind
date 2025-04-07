package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Daily368Test {

    Daily368 daily368;

    @BeforeEach
    void setUp() {
        daily368 = new Daily368();
    }

    @Test
    void largestDivisibleSubset() {
        // given
        var nums = new int[]{1, 2, 3};

        // when,then
        assertTrue(List.of(1, 2).containsAll(daily368.largestDivisibleSubset(nums)));
    }

    @Test
    void largestDivisibleSubsetAll() {
        // given
        var nums = new int[]{1, 2, 4, 8};

        // when,then
        assertTrue(List.of(1, 2, 4, 8).containsAll(daily368.largestDivisibleSubset(nums)));
    }
}