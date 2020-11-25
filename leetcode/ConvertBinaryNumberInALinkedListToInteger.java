package leetcode;

/**
 * ConvertBinaryNumberInALinkedListToInteger.
 *
 * @author Ibodulla Ibodullaev
 * @since 25.11.2020
 */
public class ConvertBinaryNumberInALinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        int decimal = head.val;
        while (head.next != null) {
            decimal = decimal * 2 + head.next.val;
            head = head.next;
        }
        return decimal;
    }
}