class Solution {
    public int numDecodings(String s) {

        if(s.length() <= 1) return 1;

        if(s.charAt(0) == 48) return 0;

        int ans = numDecodings(s.substring(1));

        if(s.charAt(0) == 49) ans = ans + numDecodings(s.substring(2));
        if(s.charAt(0) == 50 && s.charAt(1) < 55) ans = ans + numDecodings(s.substring(2));

        return ans;
    }
}