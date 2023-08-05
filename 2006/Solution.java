import java.util.HashMap;

class Solution {
    public int countKDifference(int[] nums, int k) {

        HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        int answer = 0;

        for (int num : counts.keySet()) {
            if (counts.keySet().contains(num + k)) {
                answer += counts.get(num) * counts.get(num + k);
            }
        }

        return answer;
    }
}