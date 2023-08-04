class Solution {
    public int numIdenticalPairs(int[] nums) {

        int[] counts = new int[101];

        for (int num : nums) {
            counts[num]++;
        }

        int pairs = 0;

        for (int count : counts) {
            pairs += (count * (count - 1)) / 2;
        }

        return pairs;
    }
}