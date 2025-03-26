package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Daily2033Test {

    Daily2033 daily2033;

    @BeforeEach
    void setUp() {
        daily2033 = new Daily2033();
    }

    @Test
    void shouldReturn4Operations() {
        // given
        var grid = new int[][]{{2, 4}, {6, 8}};
        var x = 2;

        // when, then
        assertEquals(4, daily2033.minOperations(grid, x));
    }

    @Test
    void shouldReturn5Operations() {
        // given
        var grid = new int[][]{{1, 5}, {2, 3}};
        var x = 1;

        // when, then
        assertEquals(5, daily2033.minOperations(grid, x));
    }

    @Test
    void shouldReturn59Operations() {
        // given
        var grid = new int[][]{{1, 1}, {1, 60}};
        var x = 1;

        // when, then
        assertEquals(59, daily2033.minOperations(grid, x));
    }

    @Test
    void shouldReturn25Operations() {
        // given
        var grid = new int[][]{{529, 529, 989}, {989, 529, 345}, {989, 805, 69}};
        var x = 92;

        // when, then
        assertEquals(25, daily2033.minOperations(grid, x));
    }

    @Test
    void shouldReturn4OperationsHere() {
        // given
        var grid = new int[][]{{3, 3, 3}, {6, 6, 6}, {3, 6, 3}};
        var x = 3;

        // when, then
        assertEquals(4, daily2033.minOperations(grid, x));
    }

    @Test
    void shouldReturnImpossibleOperations() {
        // given
        var grid = new int[][]{{1, 2}, {3, 4}};
        var x = 2;

        // when, then
        assertEquals(-1, daily2033.minOperations(grid, x));
    }
}