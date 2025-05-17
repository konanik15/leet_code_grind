package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Daily75Test {

    Daily75 daily75;

    @BeforeEach
    void setUp() {
        daily75 = new Daily75();
    }

    @Test
    void sortColors1() {
        // given
        var nums = new int[]{2, 0, 2, 1, 1, 0};

        // when, then
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, daily75.sortColors(nums));
    }

    @Test
    void sortColors2() {
        // given
        var nums = new int[]{2, 0, 1};

        // when, then
        assertArrayEquals(new int[]{0, 1, 2}, daily75.sortColors(nums));
    }
}