import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] answer = Arrays.copyOf(nums, nums.length);
        HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();

        Arrays.sort(nums);
        int last = -1;

        for (int i = 0; i < nums.length; i++) {

            if (last != nums[i]) {
                counts.put(nums[i], i);
                last = nums[i];
            }
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = counts.get(answer[i]);
        }

        return answer;
    }
}