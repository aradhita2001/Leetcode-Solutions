import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        ArrayList<Integer> answer = new ArrayList<Integer>();

        int[] count = new int[26];

        int len = p.length();

        for(int i = 0; i < len; i++){
            count[p.charAt(i) - 'a']++;
        }

        int left = 0, right = 0;

        int counter = 0;
        while(right < s.length()){

            if(count[s.charAt(right) - 'a']-- > 0){
                counter++;
            }

            while(counter == p.length()){
                if(right - left + 1 == len){
                    answer.add(left);
                } 
                if(count[s.charAt(left) - 'a']++ >= 0){
                    counter--;
                }
                left++;
            }
            right++;
        }

        return answer;
    }
}