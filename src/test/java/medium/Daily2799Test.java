package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily2799Test {

    Daily2799 daily2799;

    @BeforeEach
    void setUp() {
        daily2799 = new Daily2799();
    }

    @Test
    void countCompleteSubarrays4() {
        // given
        var nums = new int[]{1, 3, 1, 2, 2};

        // when,then
        assertEquals(4, daily2799.countCompleteSubarrays(nums));
    }

    @Test
    void countCompleteSubarrays10() {
        // given
        var nums = new int[]{1, 3, 1, 2, 2};

        // when,then
        assertEquals(4, daily2799.countCompleteSubarrays(nums));
    }
}