package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily13Test {

    Daily13 daily13;

    @BeforeEach
    void setUp() {
        daily13 = new Daily13();
    }

    @Test
    void romanToInt1994() {
        // given
        var input = "MCMXCIV";

        // when, then
        assertEquals(1994, daily13.romanToInt(input));
    }

    @Test
    void romanToInt3() {
        // given
        var input = "III";

        // when, then
        assertEquals(3, daily13.romanToInt(input));
    }

    @Test
    void romanToInt58() {
        // given
        var input = "LVIII";

        // when, then
        assertEquals(58, daily13.romanToInt(input));
    }
}