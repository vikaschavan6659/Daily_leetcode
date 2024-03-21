/*
* Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.*/

/*
*   function   in that
*   '''
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

Examples:
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
'''

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        n = 0
        temp = head
        while temp:
            n += 1
            temp = temp.next
        temp = head
        for i in range(n // 2):
            temp = temp.next
        return temp

'''
Time complexity for while loop is O(n) and for loop is O(n/2). So overall it is O(n)
Space complexity is O(1) as we only use a constant amount of extra space regardless of the size of the input linked list.
'''

class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head
        slow = head
        fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        return slow

'''
Time Complexity is O(n) as the algorithm traverses the linked list once using two pointers, slow and fast.
Space Complexity is O(1) as the algorithm only uses two pointers (slow and fast) to traverse the list i.e constant amount of extra space (two pointers).
'''
* */

public class middleOfTheLinkList {

}
