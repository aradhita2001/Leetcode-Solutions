class Solution {
    public int[] leftRightDifference(int[] nums) {

        int answer[] = new int[nums.length];
        int leftSum = 0, rightSum = 0;

        for (int num : nums) {
            rightSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            answer[i] = Math.abs(rightSum - leftSum);
            leftSum += nums[i];
        }

        return answer;

    }
}