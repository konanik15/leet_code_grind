package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily1863Test {

    Daily1863 daily1863;

    @BeforeEach
    void setUp() {
        daily1863 = new Daily1863();
    }


    @Test
    void shouldReturnSumXOR6() {
        // given
        var nums = new int[]{1, 3};

        // when, then
        assertEquals(6, daily1863.subsetXORSum(nums));
    }

    @Test
    void shouldReturnSumXOR28() {
        // given
        var nums = new int[]{5, 1, 6};

        // when, then
        assertEquals(28, daily1863.subsetXORSum(nums));
    }

    @Test
    void shouldReturnSumXOR480() {
        // given
        var nums = new int[]{3, 4, 5, 6, 7, 8};

        // when, then
        assertEquals(480, daily1863.subsetXORSum(nums));
    }

}