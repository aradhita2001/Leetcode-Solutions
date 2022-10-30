class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        
        int[] ans = new int[queries.length];

        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0) {
                sum = sum + nums[i];
            }
        }

        for(int i = 0; i < queries.length; i++){
            
            if(nums[queries[i][1]] % 2 == 0) sum = sum - nums[queries[i][1]];
            nums[queries[i][1]] += queries[i][0];
            if(nums[queries[i][1]] % 2 == 0) sum = sum + nums[queries[i][1]];
            ans[i] = sum;
            
        }

        return ans;
    }
}