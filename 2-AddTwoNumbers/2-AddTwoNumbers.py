# Last updated: 17/07/2026, 15:18:38
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        carry = 0
        dummy = ListNode(0)
        current = dummy

        while l1 or l2 or carry:
            val1 = 0
            val2 = 0

            if l1:
                val1 = l1.val

            if l2:
                val2 = l2.val

            total = val1 + val2 + carry
            carry = total // 10

            new_node = ListNode(total % 10)
            current.next = new_node
            current = current.next

            if l1:
                l1 = l1.next

            if l2:
                l2 = l2.next

        return dummy.next