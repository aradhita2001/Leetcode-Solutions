import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
    public int pairSum(ListNode head) {
        
        int max = 0;
        int count = 0;
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();

        while(head != null){
            stack.push(head.val);
            queue.add(head.val);

            count++;
            head = head.next;
        }

        count /= 2;
        for(int i = 0; i < count; i++){
            int curr = stack.pop() + queue.poll();

            max = curr > max ? curr : max;
        }

        return max;
    }
}