package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily3335Test {

    Daily3335 daily3335;

    @BeforeEach
    void setUp() {
        daily3335 = new Daily3335();
    }

    @Test
    void lengthAfterTransformations1() {
        // given
        var s = "abcyy";
        var t = 2;

        // when, then
        assertEquals(0, daily3335.lengthAfterTransformations(s, t));
    }

    @Test
    void lengthAfterTransformations2() {
        // given
        var s = "azbk";
        var t = 1;

        // when, then
        assertEquals(0, daily3335.lengthAfterTransformations(s, t));
    }


}