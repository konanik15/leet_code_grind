package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily2210Test {

    Daily2210 daily2210;

    @BeforeEach
    void setUp() {
        daily2210 = new Daily2210();
    }

    @Test
    void countHillValley3() {
        // given
        var nums = new int[]{2, 4, 1, 1, 6, 5};

        // when, then
        assertEquals(3, daily2210.countHillValley(nums));
    }

    @Test
    void countHillValley0() {
        // given
        var nums = new int[]{6, 6, 5, 5, 4, 1};

        // when, then
        assertEquals(0, daily2210.countHillValley(nums));
    }
}