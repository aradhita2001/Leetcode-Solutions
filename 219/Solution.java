import java.util.HashMap;

/*
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){

                if(j - i > k) break;
                if(nums[i] == nums[j]) return true;
            }

        }

        return false;
    }
}
*/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){

            if(map.containsKey(nums[i])){

                int prev = map.get(nums[i]);
                if(i - prev <= k) return true;
            } 
            
            map.put(nums[i], i);
        }

        return false;
    }
}