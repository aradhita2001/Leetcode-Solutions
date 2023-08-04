import java.util.List;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        if (s.length() == 0)
            return true;

        for (String word : wordDict) {
            if (s.contains(word)) {
                if (wordBreak(s.substring(0, s.indexOf(word)), wordDict)
                        && wordBreak(s.substring(s.indexOf(word) + word.length()), wordDict))
                    return true;
            }
        }
        return false;
    }
}