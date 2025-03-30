package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily2352Test {

    Daily2352 daily2352;

    @BeforeEach
    void setUp() {
        daily2352 = new Daily2352();
    }

    @Test
    void shouldReturn1EqualPair() {
        // given
        var grid = new int[][]{{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};

        // when, then
        assertEquals(1, daily2352.equalPairs(grid));
    }

    @Test
    void shouldReturn3EqualPairs() {
        // given
        var grid = new int[][]{{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}};

        // when, then
        assertEquals(3, daily2352.equalPairs(grid));
    }
}