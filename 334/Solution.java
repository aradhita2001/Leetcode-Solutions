class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        int first  = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        int length = nums.length;

        for(int i = 0; i < length; i++){

            int curr = nums[i];

            if(curr == first || curr == second) continue;
            
            if(curr < first){
                first = curr;
                continue;
            }
            if(curr < second){
                second = curr;
                continue;
            }
            return true;
        }

        return false;
    }
}