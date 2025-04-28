package hard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily2302Test {

    Daily2302 daily2302;

    @BeforeEach
    void setUp() {
        daily2302 = new Daily2302();
    }

    @Test
    void countSubarrays6() {
        // given
        var nums = new int[]{2, 1, 4, 3, 5};
        var k = 10L;

        // when, then
        assertEquals(6, daily2302.countSubarrays(nums, k));
    }

    @Test
    void countSubarrays5() {
        // given
        var nums = new int[]{1, 1, 1};
        var k = 5L;

        // when, then
        assertEquals(5, daily2302.countSubarrays(nums, k));
    }
}