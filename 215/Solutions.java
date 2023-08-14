import java.util.HashSet;
import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        for (int num : nums) {
            pQueue.add(-num);
        }

        while (pQueue.peek() != null && k > 1) {
            pQueue.poll();
            k--;
        }

        return -pQueue.peek();
    }
}