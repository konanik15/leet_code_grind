package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily2537Test {

    Daily2537 daily2537;

    @BeforeEach
    void setUp() {
        daily2537 = new Daily2537();
    }

    @Test
    void countGood1() {
        // given
        var nums = new int[]{1, 1, 1, 1, 1};
        var k = 10;

        // when, then
        assertEquals(1, daily2537.countGood(nums, k));
    }

    @Test
    void countGood4() {
        // given
        var nums = new int[]{3, 1, 4, 3, 2, 2, 4};
        var k = 2;

        // when, then
        assertEquals(4, daily2537.countGood(nums, k));
    }

    @Test
    void countGood7() {
        // given
        var nums = new int[]{1, 5, 2, 5, 3, 2, 5, 6};
        var k = 2;

        // when, then
        assertEquals(8, daily2537.countGood(nums, k));
    }

    @Test
    void countGood() {
        // given
        var nums = new int[]{1, 5, 2, 5, 3, 2, 5, 6};
        var k = 2;

        // when, then
        assertEquals(8, daily2537.countGood(nums, k));
    }

}