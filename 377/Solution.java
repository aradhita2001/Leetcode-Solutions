import java.util.HashMap;

class Solution {
    static HashMap<Integer, Integer> map;
    static int[] arr;
    static{
        map = new HashMap<Integer, Integer> ();
        map.put(0, 1);
    }
    
    public int combinationSum4(int[] nums, int target) {
        
        if(arr == null) arr = nums;
        
        if(!(arr.equals(nums))) {
            arr = nums;
            map.clear();
            map.put(0,1);
        }
        
        if(map.keySet().contains(target)) return map.get(target);
        
        int ans = 0;
        
        
        for(int num : nums){
            if(num <= target) ans += combinationSum4(nums, target - num);
        }
        
        map.put(target, ans);
        return ans;
        
    }
}