package leatcode;

/**
 * ListNode.
 *
 * @author Ibodulla Ibodullaev
 * @since 03.08.2020
 */
public class ListNode {

  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}