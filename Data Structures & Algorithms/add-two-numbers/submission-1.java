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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode r1 = new ListNode(-1);
        ListNode head = r1;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int sum = carry + l1.val + l2.val;
            carry = sum / 10;
            int digit = sum % 10;
            ListNode node = new ListNode(digit);
            r1.next = node;
            r1 = node;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int sum = carry + l1.val;
            carry = sum / 10;
            int digit = sum % 10;
            ListNode node = new ListNode(digit);
            r1.next = node;
            r1 = node;
            l1 = l1.next;
        }

        while (l2 != null) {
            int sum = carry + l2.val;
            carry = sum / 10;
            int digit = sum % 10;
            ListNode node = new ListNode(digit);
            r1.next = node;
            r1 = node;
            l2 = l2.next;
        }

        if (carry > 0) {
            ListNode node = new ListNode(carry);
            r1.next = node;
        }

        return head.next;
    }
}
