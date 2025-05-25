package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily3341Test {

    Daily3341 daily3341;

    @BeforeEach
    void setUp() {
        daily3341 = new Daily3341();
    }

    @Test
    void minTimeToReach1() {
        // given
        var moveTime = new int[][]{{0, 4}, {4, 4}};

        // when, then
        assertEquals(6, daily3341.minTimeToReach(moveTime));
    }

    @Test
    void minTimeToReach2() {
        // given
        var moveTime = new int[][]{{0, 0, 0}, {0, 0, 0}};

        // when, then
        assertEquals(3, daily3341.minTimeToReach(moveTime));
    }

    @Test
    void minTimeToReach3() {
        // given
        var moveTime = new int[][]{{0, 1}, {1, 2}};

        // when, then
        assertEquals(3, daily3341.minTimeToReach(moveTime));
    }
}