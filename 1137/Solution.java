class Solution {
   
    int highest;
    int[ ] ans;

    public Solution(){
        
        highest = 2;
        ans = new int[38];
        ans[0] = 0; 
        ans[1] = 1;
        ans[2] = 1;
    }
    
    public int tribonacci(int n) {
        
        if(n <= highest) return ans[n];

        ans[n] = tribonacci(n-3) + tribonacci(n-2) + tribonacci(n-1);
        highest = (n > highest) ? n : highest;

        return ans[n];
    }
}