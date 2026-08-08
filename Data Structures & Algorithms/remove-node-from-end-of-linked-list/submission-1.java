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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }

        int nth = size - n;
        curr = head;
        if(nth == 0) {
            return head.next;
        }
        while (nth > 1) {
            nth--;
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }
}
