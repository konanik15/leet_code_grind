package hard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily2551Test {

    Daily2551 daily2551;

    @BeforeEach
    void setUp() {
        daily2551 = new Daily2551();
    }

    @Test
    void shouldReturn4AsDifference() {
        // given
        var weights = new int[]{1, 3, 5, 1};
        var k = 2;

        // when, then
        assertEquals(4, daily2551.putMarbles(weights, k));
    }

    @Test
    void shouldReturn2AsDifferenceKEquals3() {
        // given
        var weights = new int[]{1, 3, 5, 1};
        var k = 3;

        // when, then
        assertEquals(4, daily2551.putMarbles(weights, k));
    }

    @Test
    void shouldReturn3AsDifferenceKEquals3() {
        // given
        var weights = new int[]{1, 4, 2, 5, 2};
        var k = 3;

        // when, then
        assertEquals(3, daily2551.putMarbles(weights, k));
    }

    @Test
    void shouldReturn0AsDifference() {
        // given
        var weights = new int[]{1, 3};
        var k = 2;

        // when, then
        assertEquals(0, daily2551.putMarbles(weights, k));
    }
}