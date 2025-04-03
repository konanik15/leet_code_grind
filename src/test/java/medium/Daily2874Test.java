package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily2874Test {

    Daily2874 daily2874;

    @BeforeEach
    void setUp() {
        daily2874 = new Daily2874();
    }

    @Test
    void shouldReturnMaxTriplet() {
        // given
        var nums = new int[]{12, 6, 1, 2, 7};

        // when, then
        assertEquals(77, daily2874.maximumTripletValue(nums));
    }

    @Test
    void shouldReturnMaxTriplet2() {
        // given
        var nums = new int[]{1, 10, 3, 4, 19};


        // when, then
        assertEquals(133, daily2874.maximumTripletValue(nums));
    }

    @Test
    void shouldReturnMaxTripletBig() {
        // given
        var nums = new int[]{1000000, 1, 1000000};


        // when, then
        assertEquals(999999000000L, daily2874.maximumTripletValue(nums));
    }

    @Test
    void shouldNotReturnMaxTriplet() {
        // given
        var nums = new int[]{1, 2, 3};


        // when, then
        assertEquals(0, daily2874.maximumTripletValue(nums));
    }
}