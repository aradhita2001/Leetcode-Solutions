class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k = nums.length;

        for(int i = 1; i < k; i++){
            if(nums[i] == nums[i-1]){
                for(int j = i + 1; j < k; j++){
                    nums[j-1] = nums[j];
                }

                k--;
                i--;
            }
        }

        return k;
    }
}