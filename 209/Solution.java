class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int start = 0, end = 0;
        int ans = 0, curr = 0;

        int sum = 0;
        for( ; end < nums.length; end++){

            sum += nums[end];
            curr++;

            while(start < end && sum - nums[start] >= target){
                sum -= nums[start];
                start++;
                curr--;
            }

            if(ans == 0 && sum >= target) ans = end - start + 1;

            ans = Math.min(ans, curr);
        }

        return ans;
    }
}