package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily2845Test {

    Daily2845 daily2845;

    @BeforeEach
    void setUp() {
        daily2845 = new Daily2845();
    }

    @Test
    void countInterestingSubarrays2() {
        // given
        var nums = List.of(3, 2, 4);
        var modulo = 2;
        var k = 1;

        // when, then
        assertEquals(0, daily2845.countInterestingSubarrays(nums, modulo, k));
    }

    @Test
    void countInterestingSubarrays3() {
        // given
        var nums = List.of(3, 1, 9, 6);
        var modulo = 3;
        var k = 0;

        // when, then
        assertEquals(0, daily2845.countInterestingSubarrays(nums, modulo, k));
    }
}