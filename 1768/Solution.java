class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int len = word1.length() < word2.length() ? word1.length() : word2.length();

        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < len; i++) {
            ans.append(w1[i]);
            ans.append(w2[i]);
        }

        for(; len < w1.length; len++){
            ans.append(w1[len]);
        }

        for(; len < w2.length; len++){
            ans.append(w2[len]);
        }

        return ans.toString();
    }
}