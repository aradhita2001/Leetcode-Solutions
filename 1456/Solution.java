import java.util.Set;

class Solution {
    public int maxVowels(String s, int k) {
     
        int start = 0, end = k;
        int max = 0, curr = 0;

        Set<Character> vowels = Set.of('a', 'e', 'o', 'i' , 'u');

        for(int i = 0; i < k; i++){
            if(vowels.contains(s.charAt(i))) curr++;
        }

        max = curr;

        while(end < s.length()){
            
            if(vowels.contains(s.charAt(start))) curr--;
            if(vowels.contains(s.charAt(end))) curr++;

            start++;
            end++;

            if(curr > max) max = curr;
        }

        return max;
    }
}