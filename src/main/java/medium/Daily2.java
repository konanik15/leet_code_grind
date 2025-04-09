package medium;

import data_structures.ListNode;

import java.math.BigInteger;

public class Daily2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger summedNumber = mapListNodeToBigInteger(l1).add(mapListNodeToBigInteger(l2));
        return reverseMapBigIntegerToListNode(summedNumber);
    }

    public ListNode reverseMapBigIntegerToListNode(BigInteger n) {
        var s = new StringBuilder(n.toString()).reverse().toString().toCharArray();
        var head = new ListNode();
        var current = head;
        for (int i = 0; i < s.length; i++) {
            current.val = Character.getNumericValue(s[i]);
            if (i != s.length - 1) {
                current.next = new ListNode();
                current = current.next;
            }
        }

        return head;
    }

    public BigInteger mapListNodeToBigInteger(ListNode l) {
        StringBuilder sb = new StringBuilder();
        do {
            sb.append(l.val);
            l = l.next;
        } while (l != null);
        return new BigInteger(sb.reverse().toString());
    }

}
