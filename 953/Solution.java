import java.util.HashMap;

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i = 0; i < 26; i++){
            map.put(order.charAt(i), i+1);
        }

        int maxLength = 0;
        for(int i = 0; i < words.length; i++){
            
            if(words[i].length() > maxLength) maxLength = words[i].length();
        }

        Long[] values = new Long[words.length];

        for(int i = 0; i < words.length; i++){
            
            Long val = (long) 0;
            for(int j = 0; j < maxLength; j++){
                try{
                    char c = words[i].charAt(j);
                    val = val + map.get(c);
                }
                catch(IndexOutOfBoundsException e) {

                }

                val = val * 27;
            }

            values[i] = val;

            if(i != 0 && values[i] < values[i-1]) return false;
        }

        

        return true;
    }
}