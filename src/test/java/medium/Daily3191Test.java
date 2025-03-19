package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily3191Test {

    Daily3191 daily3191;

    @BeforeEach
    void setup() {
        daily3191 = new Daily3191();
    }

    @Test
    void shouldReturnMinNumberOfOperations() {
        // given
        var nums = new int[]{0, 1, 1, 1, 0, 0};

        // when, then
        assertEquals(3, daily3191.minOperations(nums));
    }

    @Test
    void shouldReturnMinusOne() {
        // given
        var nums = new int[]{0, 1, 1, 1};

        // when, then
        assertEquals(-1, daily3191.minOperations(nums));
    }

}