package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily2873Test {

    Daily2873 daily2873;

    @BeforeEach
    void setUp() {
        daily2873 = new Daily2873();
    }

    @Test
    void shouldReturnMaxTriplet() {
        // given
        var nums = new int[]{12, 6, 1, 2, 7};

        // when, then
        assertEquals(77, daily2873.maximumTripletValueBruteForce(nums));
    }

    @Test
    void shouldReturnMaxTriplet2() {
        // given
        var nums = new int[]{1, 10, 3, 4, 19};


        // when, then
        assertEquals(133, daily2873.maximumTripletValueBruteForce(nums));
    }

    @Test
    void shouldNotReturnMaxTriplet() {
        // given
        var nums = new int[]{1, 2, 3};


        // when, then
        assertEquals(0, daily2873.maximumTripletValueBruteForce(nums));
    }

}