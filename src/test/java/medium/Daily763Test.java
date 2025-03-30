package medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily763Test {

    Daily763 daily763;

    @BeforeEach
    void setUp() {
        daily763 = new Daily763();
    }

    @Test
    void shouldReturn3PartitionLabels() {
        // given
        String s = "ababcbacadefegdehijhklij";

        // when, then
        assertEquals(List.of(9, 7, 8), daily763.partitionLabels(s));
    }


    @Test
    void shouldReturn1PartitionLabels() {
        // given
        String s = "eccbbbbdec";

        // when, then
        assertEquals(List.of(10), daily763.partitionLabels(s));
    }
}