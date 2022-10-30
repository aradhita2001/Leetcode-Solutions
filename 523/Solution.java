import java.util.HashMap;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            
            sum += nums[i];
            sum %= k;

            if(!map.containsKey(sum)) map.put(sum, i);

            if(map.get(sum) < i) return true;
        }

        return false;
    }
}