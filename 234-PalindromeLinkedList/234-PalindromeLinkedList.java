// Last updated: 04/08/2026, 09:14:27
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public boolean isPalindrome(ListNode head) {
13        ListNode slow = head, fast = head, prev, temp;
14        while (fast != null && fast.next != null) {
15            slow = slow.next;
16            fast = fast.next.next;
17        }
18        prev = slow;
19        slow = slow.next;
20        prev.next = null;
21        while (slow != null) {
22            temp = slow.next;
23            slow.next = prev;
24            prev = slow;
25            slow = temp;
26        }
27        fast = head;
28        slow = prev;
29        while (slow != null) {
30            if (fast.val != slow.val) return false;
31            fast = fast.next;
32            slow = slow.next;
33        }
34        return true;
35    }
36}