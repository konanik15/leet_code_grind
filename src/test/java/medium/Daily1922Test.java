package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily1922Test {

    Daily1922 daily1922;

    @BeforeEach
    void setUp() {
        daily1922 = new Daily1922();
    }

    @Test
    void countGoodNumbers5() {
        // given
        var n = 1;

        // when, then
        assertEquals(5, daily1922.countGoodNumbers(n));
    }

    @Test
    void countGoodNumbers400() {
        // given
        var n = 4;

        // when, then
        assertEquals(400, daily1922.countGoodNumbers(n));
    }

    @Test
    void countGoodNumbers564908303() {
        // given
        var n = 50;

        // when, then
        assertEquals(564908303, daily1922.countGoodNumbers(n));
    }

    @Test
    void countGoodNumbersBiigg() {
        // given
        long n = 806166225460393L;

        // when, then
        assertEquals(643535977, daily1922.countGoodNumbers(n));
    }
}