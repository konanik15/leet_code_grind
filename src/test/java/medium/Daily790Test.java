package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily790Test {

    Daily790 daily790;

    @BeforeEach
    void setUp() {
        daily790 = new Daily790();
    }

    @Test
    void numTilings5() {
        // given
        var n = 3;

        // when, then
        assertEquals(5, daily790.numTilings(n));
    }

    @Test
    void numTilings1() {
        // given
        var n = 1;

        // when, then
        assertEquals(1, daily790.numTilings(n));
    }

    @Test
    void numTilings979232805() {
        // given
        var n = 1000;

        // when, then
        assertEquals(979232805, daily790.numTilings(n));
    }
}