import java.util.HashSet;

class Solution {
    public int partitionString(String s) {

        int count = 1;
        HashSet<Character> set = new HashSet<Character>();

        
        for(int start = 0; start < s.length(); start++){
           
            if(set.contains(s.charAt(start))){
                count++;
                start--;
                set.clear();
            }else{
                set.add(s.charAt(start));
            }
        }

        return count;      
    }
}