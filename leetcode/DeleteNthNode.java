package leatcode;

/**
 * DeleteNthNode.
 *
 * @author Ibodulla Ibodullaev
 * @since 03.08.2020
 */
public class DeleteNthNode {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode first = head;
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    int length = 0;
    while (first != null) {
      length++;
      first = first.next;
    }
    length -= n;
    first = dummy;
    while (length > 0) {
      length--;
      first = first.next;
    }
    first.next = first.next.next;
    return dummy.next;
  }
}