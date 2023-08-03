import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {

    HashMap<String, List<String>> map;

    public Solution(){
        map = new HashMap<String, List<String>>();
        map.put("2", Arrays.asList("a", "b", "c"));
        map.put("3", Arrays.asList("d", "e", "f"));
        map.put("4", Arrays.asList("g", "h", "i"));
        map.put("5", Arrays.asList("j", "k", "l"));
        map.put("6", Arrays.asList("m", "n", "o"));
        map.put("7", Arrays.asList("p", "q", "r", "s"));
        map.put("8", Arrays.asList("t", "u", "v"));
        map.put("9", Arrays.asList("w", "x", "y", "z"));
    }

    public List<String> letterCombinations(String digits) {
        
        if(digits.equals("")) return new ArrayList<String>();

        if(digits.length() == 1) return map.get(digits);

        return join(letterCombinations(digits.substring(0, 1)), 
                                                                letterCombinations(digits.substring (1)));
    }

    List<String> join(List<String> startList, List<String> endList){
        
        List<String> answer = new ArrayList<String>() ;
        
        for(String start: startList){
            for(String end: endList){
                answer.add(start + end);
            }
        }

        return answer;
    }
}