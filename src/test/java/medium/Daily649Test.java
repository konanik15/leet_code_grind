package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static medium.Daily649.DIRE;
import static medium.Daily649.RADIANT;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily649Test {

    Daily649 daily649;

    @BeforeEach
    void setUp() {
        daily649 = new Daily649();
    }

    @Test
    void predictRadiantPartyVictory() {
        // given
        var senate = "RD";

        // when, then
        assertEquals(RADIANT, daily649.predictPartyVictory(senate));
    }

    @Test
    void predictDirePartyVictory() {
        // given
        var senate = "RDD";

        // when, then
        assertEquals(DIRE, daily649.predictPartyVictory(senate));
    }
}