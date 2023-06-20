class Solution {
    public int[] getAverages(int[] nums, int k) {
        
        int length = nums.length;
        int avgLength = 2 * k + 1;

        int[] avgs = new int[length];

        if(avgLength > length){
            for(int i = 0; i < length; i++){
                avgs[i] = -1;
            }
            return avgs;
        }

        int sum = 0;
        for(int i = 0; i < avgLength; i++){
            sum += nums[i];
        }

        for(int i = 0; i < k; i++){
            avgs[i] = -1;
            avgs[length-i-1] = -1;
        }

        for(int i = k; i < length-k; i++){
            avgs[i] = sum / avgLength;
            if(i == length - k - 1) break;
            sum -= nums[i-k];
            sum += nums[i+k+1];
        }

        return avgs;
    }
}