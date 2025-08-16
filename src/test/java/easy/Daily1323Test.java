package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily1323Test {

    Daily1323 daily1323;

    @BeforeEach
    void setUp() {
        daily1323 = new Daily1323();
    }

    @Test
    void maximum69Number1() {
        // given
        var input = 9669;

        // when, then
        assertEquals(9969, daily1323.maximum69Number(input));
    }

    @Test
    void maximum69Number2() {
        // given
        var input = 9996;

        // when, then
        assertEquals(9999, daily1323.maximum69Number(input));
    }

    @Test
    void maximum69Number3() {
        // given
        var input = 9999;

        // when, then
        assertEquals(9999, daily1323.maximum69Number(input));
    }

}