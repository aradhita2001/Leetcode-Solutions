import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer> ();
        
        for(int i = 0; i < n; i++){
            
            map.put(target - nums[i], i);
        }

        for(int i = 0; i < n; i++){
            if(map.getOrDefault(nums[i], -1) != -1 && map.get(nums[i]) != i){
                
                int[] ans = new int[2];
                ans[0] = map.get(nums[i]);
                ans[1] = i;

                return ans;
            }
        }

        return new int[0];
    }
}