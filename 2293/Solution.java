class Solution {
    public int minMaxGame(int[] nums) {
        
        int n = nums.length;

        while(n > 1){
            
            n = n/2;
            int[] half = new int[n];
            
            for(int i = 0; i < n; n++){

                if(i % 2 == 0) {
                    if(nums[2*i] < nums[2*i+1]) half[i] = nums[2*i];
                    else half[i] = nums[2*i+1];
                }

                else{
                    if(nums[2*i] > nums[2*i+1]) half[i] = nums[2*i];
                    else half[i] = nums[2*i+1];
                }

                nums = half;
            }

        }

        return nums[0];
        
    }
}