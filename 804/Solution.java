import java.util.HashSet;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String[] chars = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
                          "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-",
                          "-.--","--.."};
        
        HashSet<String> codes = new HashSet<String>();
        
        
        
        for(String word : words){
            String code = "";
            
            for(int i = 0; i < word.length(); i++){
                code = code + chars[word.charAt(i) - 'a'];
            }
            
            codes.add(code);
        }
        
        return codes.size();
    }
}