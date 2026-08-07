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
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ArrayList<ListNode> list = new ArrayList<ListNode>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        ListNode result = list.get(list.size() - 1);
        ListNode lastAddedNode = result;
        list.remove(result);
        ListIterator<ListNode> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            ListNode node = iterator.previous();
            lastAddedNode.next = node;
            lastAddedNode = node;
        }

        lastAddedNode.next = null;
        return result;
    }
}
