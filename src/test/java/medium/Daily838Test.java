package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily838Test {

    Daily838 daily838;

    @BeforeEach
    void setUp() {
        daily838 = new Daily838();
    }

    @Test
    void pushDominoes1() {
        // given
        var input = "RR.L";

        assertEquals("RR.L", daily838.pushDominoes(input));
    }

    @Test
    void pushDominoes2() {
        // given
        var input = ".L.R...LR..L..";

        assertEquals("LL.RR.LLRRLL..", daily838.pushDominoes(input));
    }
}