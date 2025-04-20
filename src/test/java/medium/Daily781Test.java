package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily781Test {

    Daily781 daily781;

    @BeforeEach
    void setUp() {
        daily781 = new Daily781();
    }

    @Test
    void numRabbits5() {
        // given
        var answers = new int[]{1, 1, 2};

        // when, then
        assertEquals(5, daily781.numRabbits(answers));
    }

    @Test
    void numRabbits11() {
        // given
        var answers = new int[]{10, 10, 10};

        // when, then
        assertEquals(11, daily781.numRabbits(answers));
    }

    @Test
    void numRabbits10() {
        // given
        var answers = new int[]{2, 1, 0, 0, 0, 0, 0};

        // when, then
        assertEquals(10, daily781.numRabbits(answers));
    }

    @Test
    void numRabbits54() {
        // given
        var answers = new int[]{5, 1, 5, 3, 5, 2, 12, 4, 20, 20};

        // when, then
        assertEquals(54, daily781.numRabbits(answers));
    }

    @Test
    void numRabbits13() {
        // given
        var answers = new int[]{1, 1, 1, 2, 2, 2, 2, 2, 2, 2};

        // when, then
        assertEquals(13, daily781.numRabbits(answers));
    }

    @Test
    void numRabbits12() {
        // given
        var answers = new int[]{5, 5, 5, 5, 5, 5, 5};

        // when, then
        assertEquals(12, daily781.numRabbits(answers));
    }

    @Test
    void numRabbits6() {
        // given
        var answers = new int[]{5, 5, 5, 5, 5, 5};

        // when, then
        assertEquals(6, daily781.numRabbits(answers));
    }

}