package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Daily342Test {

    Daily342 daily342;

    @BeforeEach
    void setUp() {
        daily342 = new Daily342();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 4, 16, 64, 256, 1024})
    void isPowerOfFourTrue(int n) {
        // given, when, then
        assertTrue(daily342.isPowerOfFour(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 8, 13, 22, 1023})
    void isPowerOfFourFalse(int n) {
        // given, when, then
        assertFalse(daily342.isPowerOfFour(n));
    }

}