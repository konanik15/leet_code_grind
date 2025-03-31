package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Daily88Test {

    Daily88 daily88;

    @BeforeEach
    void setUp() {
        daily88 = new Daily88();
    }

    @Test
    void merge() {
        // given
        var nums1 = new int[]{1, 2, 3, 0, 0, 0};
        var nums2 = new int[]{2, 5, 6};
        var m = 3;
        var n = 3;

        // when
        daily88.merge(nums1, m, nums2, n);
        // then
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, daily88.result);
    }

    @Test
    void shouldMerge() {
        // given
        var nums1 = new int[]{2, 0};
        var nums2 = new int[]{1};
        var m = 1;
        var n = 1;

        // when
        daily88.merge(nums1, m, nums2, n);
        // then
        assertArrayEquals(new int[]{1, 2}, daily88.result);
    }

}
