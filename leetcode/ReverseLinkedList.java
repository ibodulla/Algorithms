package leetcode;

/**
 * ReverseLinkedList.
 *
 * @author Ibodulla Ibodullaev
 *
 */
public class ReverseLinkedList {
  public ListNode reverseList(ListNode head) {
    ListNode tempListNode = new ListNode();
    ListNode listNode = null;
    while(head != null){
      tempListNode = new ListNode(head.val, listNode);
      listNode = tempListNode;
      head = head.next;
    }
    return listNode;
  }
}