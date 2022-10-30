import java.util.Arrays;

class Solution {
    public int largestPerimeter(int[] nums) {
        
        Arrays.sort(nums);

        int largest = nums.length - 1;

        while(largest != 1){
            if(nums[largest] < nums[largest - 1] + nums[largest - 2])
                return nums[largest] + nums[largest - 1] + nums[largest - 2];
            
            largest--;
        }

        return 0;
    }
}