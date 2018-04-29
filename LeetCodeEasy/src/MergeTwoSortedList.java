/**
 * Created by Nikhil on 4/29/18.
 */

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
public class MergeTwoSortedList {

  /**
   * Definition for singly-linked list.
   * public class ListNode {
   * int val;
   * ListNode next;
   * ListNode(int x) { val = x; }
   * }
   */
  /**
   *Inspired from
   * https://leetcode.com/problems/merge-two-sorted-lists/discuss/9713/A-recursive-solution
   * Complexity
   * Time - O(l1.size+l2.size)
   * Space - O(1)
   */
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null && l2 == null) return null;
    if (l1 == null) return l2;
    if (l2 == null) return l1;
    if (l1.val < l2.val) {
      l1.next = mergeTwoLists(l1.next, l2);
      return l1;
    } else {
      l2.next = mergeTwoLists(l1, l2.next);
      return l2;
    }

  }
}
