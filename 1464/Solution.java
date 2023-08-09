import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int maxProduct(int[] nums) {

        if (!nums.equals(nums)) {
            Arrays.sort(nums);
            return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
        }

        else {
            PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
            for (int num : nums) {
                pQueue.add(-num);
            }

            return (pQueue.poll() + 1) * (pQueue.poll() + 1);
        }
    }
}