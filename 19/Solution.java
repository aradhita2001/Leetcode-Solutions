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

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if (head.next == null) return null;
        
        int count = -1;
        ListNode curr = head, node = head;
        
        while(curr != null){
            
            curr = curr.next;
            count++;
            
            if(count <= n) continue;
            
            node = node.next;
        }
        
        if(n - 1 == count) return head.next;
        
        if(n != 1) node.next = node.next.next;
        else node.next = null;
        
        return head;
    }
}