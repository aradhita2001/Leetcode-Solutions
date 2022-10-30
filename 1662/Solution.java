class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String w1 = "";
        String w2 = "";

        for(String word : word1) w1 = w1.concat(word);
        for(String word : word2) w2 = w2.concat(word);

        if(w1.equals(w2)) return true;

        return false;
    }
}