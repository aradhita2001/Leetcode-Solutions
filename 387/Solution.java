import java.util.HashSet;

class Solution {
    public int firstUniqChar(String s) {
        
        int length = s.length();
        HashSet<Character> rejected = new HashSet<Character>();
        
        for(int i = 0; i < length; i++){
            if(rejected.contains(s.charAt(i))) continue;
            
            if(s.indexOf(s.charAt(i), i+1) == -1) return i;
            
            rejected.add(s.charAt(i));
        }
        
        return -1;
    }
}