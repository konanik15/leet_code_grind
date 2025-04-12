package hard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily3272Test {

    Daily3272 daily3272;

    @BeforeEach
    void setUp() {
        daily3272 = new Daily3272();
    }

    @Test
    void countGoodIntegers27() {
        // given
        var n = 3;
        var k = 5;

        // when, then
        assertEquals(27, daily3272.countGoodIntegers(n, k));
    }

    @Test
    void countGoodIntegers2() {
        // given
        var n = 1;
        var k = 4;

        // when, then
        assertEquals(2, daily3272.countGoodIntegers(n, k));
    }

    @Test
    void countGoodIntegers2468() {
        // given
        var n = 5;
        var k = 6;

        // when, then
        assertEquals(2468, daily3272.countGoodIntegers(n, k));
    }
}