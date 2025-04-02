package hard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Daily3108Test {

    Daily3108 daily3108;

    @BeforeEach
    void setUp() {
        daily3108 = new Daily3108();
    }

    @Test
    void minimumCost() {
        // given
        var n = 5;
        var edges = new int[][]{{0, 1, 7}, {1, 3, 7}, {1, 2, 1}};
        var query = new int[][]{{0, 3}, {3, 4}};

        // when, then
        assertArrayEquals(new int[]{1, -1}, daily3108.minimumCost(n, edges, query));
    }

    @Test
    void minimumCost2() {
        // given
        var n = 4;
        var edges = new int[][]{{2, 3, 1}, {1, 3, 5}, {1, 2, 6}, {3, 0, 7}, {1, 3, 7}, {0, 2, 5}, {0, 1, 7}};
        var query = new int[][]{{2, 1}, {1, 2}, {0, 1}, {2, 0}, {0, 2}, {1, 2}, {3, 2}, {0, 3}, {2, 1}, {1, 2}};

        // when, then
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, daily3108.minimumCost(n, edges, query));
    }
}