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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;

        ListNode ans = new ListNode();

        ListNode curr1 = l1, curr2 = l2, curr = ans;

        while (curr1 != null && curr2 != null) {

            curr.next = new ListNode();
            curr = curr.next;
            curr.val = (curr1.val + curr2.val + carry) % 10;
            carry = (curr1.val + curr2.val + carry) / 10;

            curr1 = curr1.next;
            curr2 = curr2.next;

        }

        while (curr1 != null) {

            curr.next = new ListNode();
            curr = curr.next;
            curr.val = (curr1.val + carry) % 10;
            carry = (curr1.val + carry) / 10;

            curr1 = curr1.next;

        }

        while (curr2 != null) {

            curr.next = new ListNode();
            curr = curr.next;
            curr.val = (curr2.val + carry) % 10;
            carry = (curr2.val + carry) / 10;

            curr2 = curr2.next;

        }

        if (carry == 1)
            curr.next = new ListNode(carry);

        return ans.next;
    }
}