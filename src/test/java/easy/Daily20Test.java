package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class Daily20Test {

    Daily20 daily20;

    @BeforeEach
    void setUp() {
        daily20 = new Daily20();
    }


    @ParameterizedTest
    @ValueSource(strings = {"()", "()[]{}", "([])"})
    void isValid(String input) {
        // given, when, then
        assertTrue(daily20.isValid(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"(]", "([)]", "(((("})
    void isNotValid(String input) {
        assertFalse(daily20.isValid(input));
    }
}