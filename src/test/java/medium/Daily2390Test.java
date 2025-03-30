package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily2390Test {

    Daily2390 daily2390;

    @BeforeEach
    void setUp() {
        daily2390 = new Daily2390();
    }

    @Test
    void shouldRemoveSomeStars() {
        // given
        var input = "leet**cod*e";

        // when, then
        assertEquals("lecoe", daily2390.removeStars(input));
    }

    @Test
    void shouldRemoveAll() {
        // given
        var input = "erase*****";

        // when, then
        assertEquals("", daily2390.removeStars(input));
    }

    @Test
    void shouldRemoveAllShort() {
        // given
        var input = "e*";

        // when, then
        assertEquals("", daily2390.removeStars(input));
    }


}