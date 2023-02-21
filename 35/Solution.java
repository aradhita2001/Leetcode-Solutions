class Solution {
    public int searchInsert(int[] nums, int target) {
 
        int start = 0, end = nums.length - 1, curr = 0;

        while(start <= end){
            curr = (start + end) / 2;
            if(nums[curr] == target) return curr;
            if(nums[curr] < target) start = curr + 1;
            else end = curr - 1;
        }

        if(nums[curr] < target) return curr + 1;
        return curr;
    }
}