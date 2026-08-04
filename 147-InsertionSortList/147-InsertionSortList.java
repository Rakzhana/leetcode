// Last updated: 04/08/2026, 10:25:18
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0); // sorted list head

        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // store next node

            // find position in sorted list
            ListNode prev = dummy;

            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }

            // insert curr between prev and prev.next
            curr.next = prev.next;
            prev.next = curr;

            curr = next; // move forward
        }

        return dummy.next;
    }
}