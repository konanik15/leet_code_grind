package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily3Test {

    Daily3 daily3;

    @BeforeEach
    void setUp() {
        daily3 = new Daily3();
    }

    @Test
    void lengthOfLongestSubstringABCABCCBB() {
        // given
        var input = "abcabcbb";

        // when, then
        assertEquals(3, daily3.lengthOfLongestSubstring(input));
    }

    @Test
    void lengthOfLongestSubstringBBBB() {
        // given
        var input = "bbbb";

        // when, then
        assertEquals(1, daily3.lengthOfLongestSubstring(input));
    }

    @Test
    void lengthOfLongestSubstringPWWKEW() {
        // given
        var input = "pwwkew";

        // when, then
        assertEquals(3, daily3.lengthOfLongestSubstring(input));
    }

    @Test
    void lengthOfLongestSubstringDVDF() {
        // given
        var input = "dvdf";

        // when, then
        assertEquals(3, daily3.lengthOfLongestSubstring(input));
    }
}