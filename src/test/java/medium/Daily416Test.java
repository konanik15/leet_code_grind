package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Daily416Test {

    Daily416 daily416;

    @BeforeEach
    void setUp() {
        daily416 = new Daily416();
    }

    @Test
    void canPartition() {
        // given
        var nums = new int[]{1, 5, 11, 5};

        // when,then
        assertTrue(daily416.canPartition(nums));
    }

    @Test
    void canNotPartition() {
        // given
        var nums = new int[]{1, 2, 3, 5};

        // when,then
        assertFalse(daily416.canPartition(nums));
    }
}