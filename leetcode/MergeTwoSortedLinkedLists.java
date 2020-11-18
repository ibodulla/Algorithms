package leatcode;

/**
 * MergeTwoSortedLinkedLists.
 *
 * @author Ibodulla Ibodullaev
 * @since 05.08.2020
 */
public class MergeTwoSortedLinkedLists {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode mergedList = new ListNode(0);
    ListNode temp = mergedList;
    while(l1 != null && l2 != null) {
      if(l1.val < l2.val) {
        mergedList.next = l1;
        l1 = l1.next;
      } else {
        mergedList.next = l2;
        l2 = l2.next;
      }
      mergedList = mergedList.next;
    }
    if(l2 != null){
      mergedList.next = l2;
    }
    if(l1 != null){
      mergedList.next = l1;
    }

    return temp.next;
  }
}