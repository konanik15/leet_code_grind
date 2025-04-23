package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily1399Test {


    Daily1399 daily1399;

    @BeforeEach
    void setUp() {
        daily1399 = new Daily1399();
    }

    @Test
    void countLargestGroup4() {
        // given
        var n = 13;

        // when, then
        assertEquals(4, daily1399.countLargestGroup(n));
    }

    @Test
    void countLargestGroup2() {
        // given
        var n = 2;

        // when, then
        assertEquals(2, daily1399.countLargestGroup(n));
    }

    @Test
    void countLargestGroup10000() {
        // given
        var n = 10000;

        // when, then
        assertEquals(1, daily1399.countLargestGroup(n));
    }

}