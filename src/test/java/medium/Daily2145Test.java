package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily2145Test {

    Daily2145 daily2145;

    @BeforeEach
    void setUp() {
        daily2145 = new Daily2145();
    }

    @Test
    void shouldReturn2NumbersOfArrays() {
        // given
        var differences = new int[]{1, -3, 4};
        var lower = 1;
        var upper = 6;

        // when, then
        assertEquals(2, daily2145.numberOfArrays(differences, lower, upper));
    }

    @Test
    void shouldReturn4NumbersOfArrays() {
        // given
        var differences = new int[]{3, -4, 5, 1, -2};
        var lower = -4;
        var upper = 5;

        // when, then
        assertEquals(4, daily2145.numberOfArrays(differences, lower, upper));
    }

    @Test
    void shouldReturn0NumbersOfArrays() {
        // given
        var differences = new int[]{4, -7, 2};
        var lower = 3;
        var upper = 6;

        // when, then
        assertEquals(0, daily2145.numberOfArrays(differences, lower, upper));
    }
}