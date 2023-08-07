/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {

        ListNode start = head, end = head.next, ansHead = null, ansCurr = null;

        while (end != null) {

            int sum = 0;

            while (end.val != 0) {
                sum += end.val;
                end = end.next;
            }

            if (start == head) {
                ansHead = ansCurr = new ListNode(sum);
            } else {
                ansCurr.next = new ListNode(sum);
                ansCurr = ansCurr.next;
            }

            start = end;
            end = end.next;
        }

        return ansHead;
    }
}