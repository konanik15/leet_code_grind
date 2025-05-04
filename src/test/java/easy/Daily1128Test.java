package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily1128Test {

    Daily1128 daily1128;

    @BeforeEach
    void setUp() {
        daily1128 = new Daily1128();
    }

    @Test
    void numEquivDominoPairs1() {
        // given
        var dominoes = new int[][]{{1, 2}, {2, 1}, {3, 4}, {5, 6}};

        // when, then
        assertEquals(1, daily1128.numEquivDominoPairs(dominoes));
    }

    @Test
    void numEquivDominoPairs3() {
        // given
        var dominoes = new int[][]{{1, 2}, {1, 2}, {1, 1}, {1, 2}, {2, 2}};

        // when, then
        assertEquals(3, daily1128.numEquivDominoPairs(dominoes));
    }
}