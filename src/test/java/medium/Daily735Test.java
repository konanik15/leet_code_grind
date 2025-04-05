package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Daily735Test {

    Daily735 daily735;

    @BeforeEach
    void setUp() {
        daily735 = new Daily735();
    }

    @Test
    void asteroidCollisionTwo() {
        // given
        var nums = new int[]{5, 10, -5};

        // when, then
        assertArrayEquals(new int[]{5, 10}, daily735.asteroidCollision(nums));
    }

    @Test
    void asteroidCollisionEmpty() {
        // given
        var nums = new int[]{8, -8};

        // when, then
        assertArrayEquals(new int[]{}, daily735.asteroidCollision(nums));
    }

    @Test
    void asteroidCollisionOne() {
        // given
        var nums = new int[]{10, 2, -5};

        // when, then
        assertArrayEquals(new int[]{10}, daily735.asteroidCollision(nums));
    }

    @Test
    void asteroidCollisionTwoTwo() {
        // given
        var nums = new int[]{1, -2, 10, -5};

        // when, then
        assertArrayEquals(new int[]{-2, 10}, daily735.asteroidCollision(nums));
    }
}