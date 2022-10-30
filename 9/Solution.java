class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0) return false;

        int n = x, curr = 0;
        while(n > 0){
            curr = curr * 10;
            curr = curr + n % 10;
            n = n / 10;
        }

        if(curr == x) return true;

        return false;
    }
}