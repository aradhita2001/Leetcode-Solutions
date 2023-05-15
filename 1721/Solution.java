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
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode first = head;
        for(int i = 1; i < k; i++){
            first = first.next;
        }

        ListNode end = head;
        ListNode endgap = first;

        while (endgap.next != null) {
            endgap = endgap.next;
            end = end.next;
        }

        int temp = first.val;
        first.val = end.val;
        end.val = temp;

        return head;
    }
}