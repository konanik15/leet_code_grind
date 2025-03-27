package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Daily2780Test {

    Daily2780 daily2780;

    @BeforeEach
    void setUp() {
        daily2780 = new Daily2780();
    }

    @Test
    void shouldReturn2() {
        // given
        var nums = List.of(1, 2, 2, 2);

        // when, then
        assertEquals(2, daily2780.minimumIndex(nums));
    }

    @Test
    void shouldReturn4() {
        // given
        var nums = List.of(2, 1, 3, 1, 1, 1, 7, 1, 2, 1);

        // when, then
        assertEquals(4, daily2780.minimumIndex(nums));
    }


    @Test
    void shouldReturnImpossible() {
        // given
        var nums = List.of(3, 3, 3, 3, 7, 2, 2);

        // when, then
        assertEquals(-1, daily2780.minimumIndex(nums));
    }

}