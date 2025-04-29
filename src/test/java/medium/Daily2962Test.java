package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily2962Test {

    Daily2962 daily2962;

    @BeforeEach
    void setUp() {
        daily2962 = new Daily2962();
    }

    @Test
    void countSubarrays6() {
        // given
        var nums = new int[]{1, 3, 2, 3, 3};
        var k = 2;

        // when, then
        assertEquals(6, daily2962.countSubarrays(nums, k));
    }

    @Test
    void countSubarrays0() {
        // given
        var nums = new int[]{1, 4, 2, 1};
        var k = 3;

        // when, then
        assertEquals(0, daily2962.countSubarrays(nums, k));
    }
}