package hard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily2999Test {

    Daily2999 daily2999;

    @BeforeEach
    void setUp() {
        daily2999 = new Daily2999();
    }

    @Test
    void numberOfPowerfulInt6() {
        // given
        var start = 1;
        var finish = 6500;
        var limit = 5;
        var s = "124";

        // when, then
        assertEquals(6, daily2999.numberOfPowerfulInt(start, finish, limit, s));
    }

    @Test
    void numberOfPowerfulInt14() {
        // given
        var start = 15;
        var finish = 215;
        var limit = 6;
        var s = "1";

        // when, then
        assertEquals(14, daily2999.numberOfPowerfulInt(start, finish, limit, s));
    }

    @Test
    void numberOfPowerfulInt0() {
        // given
        var start = 1000;
        var finish = 2000;
        var limit = 4;
        var s = "3000";

        // when, then
        assertEquals(0, daily2999.numberOfPowerfulInt(start, finish, limit, s));
    }
}