package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily2140Test {

    Daily2140 daily2140;

    @BeforeEach
    void setUp() {
        daily2140 = new Daily2140();
    }

    @Test
    void shouldGet5MostPoints() {
        // given
        var questions = new int[][]{{3, 2}, {4, 3}, {4, 4}, {2, 5}};

        // when, then
        assertEquals(5, daily2140.mostPoints(questions));
    }

    @Test
    void shouldGet7MostPoints() {
        // given
        var questions = new int[][]{{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}};

        // when, then
        assertEquals(7, daily2140.mostPoints(questions));
    }

    @Test
    void shouldGet79MostPoints() {
        // given
        var questions = new int[][]{{21, 2}, {19, 1}, {37, 3}, {33, 4}, {58, 1}};

        // when, then
        assertEquals(79, daily2140.mostPoints(questions));
    }


}