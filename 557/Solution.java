class Solution {
    public String reverseWords(String s) {
        
        String ans = "";

        int idx = s.indexOf(" ");
        while(idx != -1){
            ans = ans + reverse(s.substring(0, idx));
            s = s.substring(idx + 1);
            idx = s.indexOf(" ");
            if(idx != -1) ans = ans + " ";
        }

        if(ans.length() != 0) ans = ans + " ";
        ans = ans + reverse(s.substring(0));
        return ans;
    }

    public String reverse(String s){
        
        String ans = "";
        for(int i =0; i < s.length(); i++){
            ans = s.charAt(i) + ans;
        }

        return ans;
    }
}