package medium;

import data_structures.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Daily2Test {

    Daily2 daily2;

    @BeforeEach
    void setUp() {
        daily2 = new Daily2();
    }

    @Test
    void shouldMapBigIntegerToListNode() {
        // given
        var bigInteger = new BigInteger("321");
        ListNode a = new ListNode(3, null);
        ListNode b = new ListNode(2, a);
        ListNode c = new ListNode(1, b);

        // when, then
        assertEquals(c, daily2.reverseMapBigIntegerToListNode(bigInteger));
    }

    @Test
    void shouldAddTwoNumbers() {
        // given
        var l1 = daily2.reverseMapBigIntegerToListNode(new BigInteger("342"));
        var l2 = daily2.reverseMapBigIntegerToListNode(new BigInteger("465"));
        var output = daily2.reverseMapBigIntegerToListNode(new BigInteger("807"));

        // when, then
        assertEquals(output, daily2.addTwoNumbers(l1, l2));
    }

    @Test
    void mapListNodeToBigInteger() {
        // given
        var bigInteger = new BigInteger("342");
        var l1 = daily2.reverseMapBigIntegerToListNode(bigInteger);

        // when, then
        assertEquals(bigInteger, daily2.mapListNodeToBigInteger(l1));

    }
}