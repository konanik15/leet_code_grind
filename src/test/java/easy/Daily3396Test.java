package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily3396Test {

    Daily3396 daily3396;

    @BeforeEach
    void setUp() {
        daily3396 = new Daily3396();
    }

    @Test
    void minimumOperationsDistinct() {
        // given
        var nums = new int[]{1, 2, 3, 4, 2, 3, 3, 5, 7};

        // when, then
        assertEquals(2, daily3396.minimumOperations(nums));
    }

    @Test
    void minimumOperationsDistinct2() {
        // given
        var nums = new int[]{4, 5, 6, 4, 4};

        // when, then
        assertEquals(2, daily3396.minimumOperations(nums));
    }

    @Test
    void minimumOperationsDistinct3() {
        // given
        var nums = new int[]{5, 5};

        // when, then
        assertEquals(1, daily3396.minimumOperations(nums));
    }

    @Test
    void minimumOperationsDistinct4() {
        // given
        var nums = new int[]{8, 10, 7, 1, 5, 1, 8};

        // when, then
        assertEquals(2, daily3396.minimumOperations(nums));
    }

    @Test
    void minimumOperationsDistinct5() {
        // given
        var nums = new int[]{8, 10, 7, 1, 5, 1, 8};

        // when, then
        assertEquals(2, daily3396.minimumOperations(nums));
    }


    @Test
    void alreadyDistinctMinimumOperations() {
        // given
        var nums = new int[]{6, 7, 8, 9};

        // when, then
        assertEquals(0, daily3396.minimumOperations(nums));
    }

}