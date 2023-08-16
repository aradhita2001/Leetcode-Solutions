import java.util.PriorityQueue;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int ans[] = new int[nums.length - k + 1];
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        for (int i = 0; i < k; i++) {
            pQueue.add(-nums[i]);
        }

        ans[0] = -pQueue.peek();

        for (int i = 0; i < ans.length - 1;) {

            pQueue.remove(-nums[i]);
            pQueue.add(-nums[k + i]);
            ans[++i] = -pQueue.peek();
        }

        return ans;
    }
}