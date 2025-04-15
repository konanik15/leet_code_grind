package hard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily2179Test {

    Daily2179 daily2179;

    @BeforeEach
    void setUp() {
        daily2179 = new Daily2179();
    }

    @Test
    void goodTriplets1() {
        // given
        var nums1 = new int[]{2, 0, 1, 3};
        var nums2 = new int[]{0, 1, 2, 3};


        // when, then
        assertEquals(1, daily2179.goodTriplets(nums1, nums2));
    }

    @Test
    void goodTriplets4() {
        // given
        var nums1 = new int[]{4, 0, 1, 3, 2};
        var nums2 = new int[]{4, 1, 0, 2, 3};


        // when, then
        assertEquals(4, daily2179.goodTriplets(nums1, nums2));
    }
}