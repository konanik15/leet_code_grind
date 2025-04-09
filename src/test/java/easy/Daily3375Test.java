package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily3375Test {

    Daily3375 daily3375;

    @BeforeEach
    void setUp() {
        daily3375 = new Daily3375();
    }

    @Test
    void minimumOperationsToEqualK1() {
        // given
        var nums = new int[]{5, 2, 5, 4, 5};
        var k = 2;

        // when, then
        assertEquals(2, daily3375.minOperations(nums, k));
    }

    @Test
    void minimumOperationsToEqualK2() {
        // given
        var nums = new int[]{2, 1, 2};
        var k = 2;

        // when, then
        assertEquals(-1, daily3375.minOperations(nums, k));
    }

    @Test
    void minimumOperationsToEqualK3() {
        // given
        var nums = new int[]{9, 7, 5, 3};
        var k = 1;

        // when, then
        assertEquals(4, daily3375.minOperations(nums, k));
    }
}