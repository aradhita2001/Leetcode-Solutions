import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap[] maps = new HashMap[strs.length];

        for (int i = 0; i < strs.length; i++) {

            HashMap<Character, Integer> currMap = new HashMap<Character, Integer>();
            String currWord = strs[i];

            for (int j = 0; j < strs[i].length(); j++) {
                char curr = currWord.charAt(j);
                currMap.put(curr, currMap.getOrDefault(curr, 0) + 1);
            }

            maps[i] = currMap;
        }

        ArrayList<List<String>> ans = new ArrayList<List<String>>();

        HashMap<HashMap<Character, Integer>, List<String>> ansMap = new HashMap<HashMap<Character, Integer>, List<String>>();

        for (int i = 0; i < maps.length; i++) {

            List<String> currList;

            if (ansMap.keySet().contains(maps[i])) {
                currList = ansMap.get(maps[i]);
            } else {
                currList = new ArrayList<String>();
                ansMap.put(maps[i], currList);
                ans.add(currList);
            }

            currList.add(strs[i]);
        }

        return ans;
    }
}