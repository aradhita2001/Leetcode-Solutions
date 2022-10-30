import java.util.ArrayList;

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
    public ListNode deleteMiddle(ListNode head) {

        if(head.next == null) return null;

        int count = 0;
        ArrayList<ListNode> arr = new ArrayList<ListNode>();
        ListNode curr = head;

        do{
            arr.add(curr);
            count++;
            curr = curr.next;
        } while(curr != null);

        arr.get(count/ 2 - 1).next = arr.get(count / 2 - 1).next.next;
        
        return head;
    }
}