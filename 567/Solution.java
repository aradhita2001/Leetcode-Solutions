import java.util.HashMap;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length()) return false;

        if(s1.equals(s2)) return true;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s1.length(); i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        HashMap<Character, Integer> currMap = new HashMap<Character, Integer>();
        for(int i = 0; i < s1.length(); i++){
            currMap.put(s2.charAt(i), currMap.getOrDefault(s2.charAt(i), 0) + 1);
        }

        if(map.equals(currMap)) return true;

        for(int i = 0; i < s2.length() - s1.length(); i++){
            
            
            currMap.put(s2.charAt(i + s1.length()), currMap.getOrDefault(s2.charAt(i + s1.length()), 0) + 1);
            currMap.put(s2.charAt(i), currMap.get(s2.charAt(i)) - 1);

            if(currMap.get(s2.charAt(i)) == 0) currMap.remove(s2.charAt(i));
 
            if(map.equals(currMap)) return true;
        }

        System.out.println("map");

        for(char c : map.keySet()){
            System.out.println(c + " " + map.get(c));
        }

        System.out.println("currMap");

        for(char c : currMap.keySet()){
            System.out.println(c + " " + currMap.get(c));
        }

        return false;
    }
}