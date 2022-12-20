class Solution {
    public int minMutation(String start, String end, String[] bank) {
        
        int ans = -1;

        for(int i = 0; i < bank.length; i++){
            if(bank[i].equals(end)){
                ans = 0;
                break;
            }
        }

        if(ans == -1) return ans;

        for(int i = 0; i < start.length(); i++){
            if(start.charAt(i) != end.charAt(i)) ans++;
        }

        return ans;
    }
}