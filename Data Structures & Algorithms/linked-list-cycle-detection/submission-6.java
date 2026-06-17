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
    public boolean hasCycle(ListNode head) {
        Set<ListNode> visitedNodes = new HashSet();
        if(head == null) {
            return false;
        }
    while(!visitedNodes.contains(head) && head != null) {
            visitedNodes.add(head);
            head = head.next;
        }
        return head != null;
    }
}
