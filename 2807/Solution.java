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
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode curr = head;

        while (curr.next != null) {
            curr.next = new ListNode(gcf(curr.val, curr.next.val), curr.next);
            curr = curr.next.next;
        }

        return head;
    }

    int gcf(int n1, int n2) {

        if (n1 == n2)
            return n1;

        if (n1 < n2) {
            n1 = n1 + n2;
            n2 = n1 - n2;
            n1 = n1 - n2;
        }

        if (n1 % n2 == 0)
            return n2;

        return gcf(n2, n1 % n2);
    }
}