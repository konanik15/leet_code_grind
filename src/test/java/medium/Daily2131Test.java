package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily2131Test {

    Daily2131 daily2131;

    @BeforeEach
    void setUp() {
        daily2131 = new Daily2131();
    }

    @Test
    void longestPalindrome6() {
        // given
        var words = new String[]{"lc", "cl", "gg"};

        // when,then
        assertEquals(6, daily2131.longestPalindrome(words));
    }

    @Test
    void longestPalindrome8() {
        // given
        var words = new String[]{"ab", "ty", "yt", "lc", "cl", "ab"};

        // when,then
        assertEquals(8, daily2131.longestPalindrome(words));
    }

    @Test
    void longestPalindrome2() {
        // given
        var words = new String[]{"cc", "ll", "xx"};

        // when,then
        assertEquals(2, daily2131.longestPalindrome(words));
    }

    @Test
    void longestPalindrome14() {
        // given
        var words = new String[]{"qo", "fo", "fq", "qf", "fo", "ff", "qq", "qf", "of", "of", "oo", "of", "of", "qf", "qf", "of"};

        // when,then
        assertEquals(14, daily2131.longestPalindrome(words));
    }
}