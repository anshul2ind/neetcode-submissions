# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        if not lists or len(lists) < 1:
            return None
        l1 = None
        for i in range(0, len(lists)):
            l2 = lists[i]
            # print(l1, l2)
            l1 = self.mergeSortedList(l1, l2)
            # print(mergedList)
        return l1

    def mergeSortedList(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        result = curr = ListNode()
        # print(1)
        while l1 and l2:
            if l1.val <= l2.val:
                curr.next = l1
                l1 = l1.next
            else:
                curr.next = l2
                l2 = l2.next
            curr = curr.next

        while l1:
            curr.next = l1
            l1 = l1.next
            curr = curr.next

        while l2:
            curr.next = l2
            l2 = l2.next
            curr = curr.next

        # curr.next = None

        # print(result)
        return result.next



        