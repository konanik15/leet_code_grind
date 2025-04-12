package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily394Test {

    Daily394 daily394;

    @BeforeEach
    void setUp() {
        daily394 = new Daily394();
    }

    @Test
    void decodeString1() {
        // given
        String input = "3[a]2[bc]";

        // when, then
        assertEquals("aaabcbc", daily394.decodeString(input));
    }

    @Test
    void decodeString2() {
        // given
        String input = "3[a2[c]]";

        // when, then
        assertEquals("accaccacc", daily394.decodeString(input));

    }

    @Test
    void decodeString3() {
        // given
        String input = "2[abc]3[cd]ef";

        // when, then
        assertEquals("abcabccdcdcdef", daily394.decodeString(input));
    }

    @Test
    void decodeString100() {
        // given
        String input = "100[leetcode]";

        // when, then
        assertEquals("leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode",
                daily394.decodeString(input));
    }

    @Test
    void decodeStringMany() {
        // given
        String input = "3[z]2[2[y]pq4[2[jk]e1[f]]]ef";

        // when, then
        assertEquals("zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef",
                daily394.decodeString(input));
    }

    @Test
    void decodeStringMiddleMan() {
        // given
        String input = "4[2[jk]e1[f]]";

        // when, then
        assertEquals("jkjkefjkjkefjkjkefjkjkef",
                daily394.decodeString(input));
    }

}