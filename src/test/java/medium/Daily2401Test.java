package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Daily2401Test {


    Daily2401 daily2401;

    @BeforeEach
    void setUp() {
        daily2401 = new Daily2401();
    }

    @Test
    void shouldReturnLongestNiceSubarrayLength() {
        // given
        var nums = new int[]{1,3,8,48,10};

        // when, then
        assertEquals(3, daily2401.longestNiceSubarray(nums));
    }


    @Test
    void shouldReturnLongestDefaultLength() {
        // given
        var nums = new int[]{3,1,5,11,13};

        // when, then
        assertEquals(1, daily2401.longestNiceSubarray(nums));
    }
}