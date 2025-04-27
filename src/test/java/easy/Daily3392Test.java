package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily3392Test {

    Daily3392 daily3392;

    @BeforeEach
    void setUp() {
        daily3392 = new Daily3392();
    }

    @Test
    void countSubarrays() {
        // given
        var nums = new int[]{1, 2, 1, 4, 1};

        // when, then
        assertEquals(1, daily3392.countSubarrays(nums));
    }
}