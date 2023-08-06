import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        
        int start = 0, end;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();        

        for(end = 0; end < nums.length; end++) {

            int num = nums[end];
            map.put(num, map.getOrDefault(num, 0) + 1);

            while(map.keySet().size() > k){
                map.put(nums[start], map.get(nums[start]) - 1);
                if(map.get(nums[start]) == 0) map.remove(nums[start]);
                start++;
            }

            if(map.keySet().size() == k){
                count++;
                System.out.println(start + "  " + end);
            }
        }


        return count;
    }
}