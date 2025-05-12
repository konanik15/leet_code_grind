package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Daily2094Test {

    Daily2094 daily2094;

    @BeforeEach
    void setUp() {
        daily2094 = new Daily2094();
    }

    @Test
    void findEvenNumbers1() {
        // given
        var digits = new int[]{2, 1, 3, 0};


        // when, then
        assertArrayEquals(new int[]{102, 120, 130, 132, 210, 230, 302, 310, 312, 320}, daily2094.findEvenNumbers(digits));
    }

    @Test
    void findEvenNumbers2() {
        // given
        var digits = new int[]{2, 2, 8, 8, 2};


        // when, then
        assertArrayEquals(new int[]{222, 228, 282, 288, 822, 828, 882}, daily2094.findEvenNumbers(digits));
    }

    @Test
    void findEvenNumbers3() {
        // given
        var digits = new int[]{3, 7, 5};


        // when, then
        assertArrayEquals(new int[]{}, daily2094.findEvenNumbers(digits));
    }
}