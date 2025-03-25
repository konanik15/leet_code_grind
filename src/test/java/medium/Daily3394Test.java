package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Daily3394Test {

    Daily3394 daily3394;

    @BeforeEach
    void setUp() {
        daily3394 = new Daily3394();
    }

    @Test()
    void shouldReturnTrueFor3() {
        // given
        var n = 3;
        var rectangles = new int[][]{{0, 0, 1, 3}, {1, 0, 2, 3}, {2, 0, 3, 3}};

        // when, then
        assertTrue(daily3394.checkValidCuts(n, rectangles));

    }

    @Test()
    void shouldReturnTrueFor5() {
        // given
        var n = 5;
        var rectangles = new int[][]{{1, 0, 5, 2}, {0, 2, 2, 4}, {3, 2, 5, 3}, {0, 4, 4, 5}};

        // when, then
        assertTrue(daily3394.checkValidCuts(n, rectangles));

    }

    @Test
    void shouldReturnTrueFor4() {
        // given
        var n = 4;
        var rectangles = new int[][]{{0, 0, 1, 1}, {2, 0, 3, 4}, {0, 2, 2, 3}, {3, 0, 4, 3}};

        // when, then
        assertTrue(daily3394.checkValidCuts(n, rectangles));

    }


    @Test
    void shouldReturnFalseFor4() {
        // given
        var n = 4;
        var rectangles = new int[][]{{0, 2, 2, 4}, {1, 0, 3, 2}, {2, 2, 3, 4}, {3, 0, 4, 2}, {3, 2, 4, 4}};

        // when, then
        assertFalse(daily3394.checkValidCuts(n, rectangles));

    }

    @Test
    void shouldReturnFalseFor6() {
        // given
        var n = 6;
        var rectangles = new int[][]{{4, 0, 5, 2}, {0, 5, 4, 6}, {4, 5, 6, 6}};

        // when, then
        assertFalse(daily3394.checkValidCuts(n, rectangles));

    }

}