class Solution {
    public int singleNonDuplicate(int[] nums) {

        if(nums.length == 1) return nums[0];

        int start = 0, end = nums.length - 1, mid = 0;

        while(start <= end){
            
            mid = (start + end) / 2;
            
            if(mid % 2 == 0){
                if(nums[mid] == nums[mid+1]) start = mid + 2;
                else if(nums[mid] == nums[mid-1]) end = mid -2;
                else return nums[mid];
            }
            else{
                if(nums[mid] < nums[mid+1]) start = mid + 1;
                else end = mid - 1;
            }
        }

        return nums[mid];
    }
}