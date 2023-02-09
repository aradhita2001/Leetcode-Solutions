class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1)
            return 0;

        for (int i = nums.length - 1; i >= 0; i--) {

            if (nums[i] == 0) {
                nums[i] = nums.length + 345;
                continue;
            }

            if (nums[i] + i >= nums.length - 1) {
                nums[i] = 1;
                continue;
            }

            int min = nums.length;

            for (int j = 1; j <= nums[i]; j++) {
                if (i + j < nums.length && nums[i + j] < min)
                    min = nums[i + j];
            }

            nums[i] = min + 1;
        }

        return nums[0];
    }
}