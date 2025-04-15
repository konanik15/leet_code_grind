package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily1534Test {

    Daily1534 daily1534;

    @BeforeEach
    void setUp() {
        daily1534 = new Daily1534();
    }

    @Test
    void countGoodTriplets() {
        // given
        var arr = new int[]{3, 0, 1, 1, 9, 7};
        var a = 7;
        var b = 2;
        var c = 3;

        // when, then
        assertEquals(4, daily1534.countGoodTriplets(arr, a, b, c));
    }
}