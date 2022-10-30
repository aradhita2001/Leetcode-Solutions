import java.util.EmptyStackException;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> track = new Stack<Character>();

        for(int i = 0; i < s.length(); i++){
            
            char curr = s.charAt(i);
            char prev;


            if(curr == '(' || curr == '{' || curr == '[') track.push(curr);
            else{
                try{
                    prev = track.pop();
                }
                catch(EmptyStackException e){
                    return false;
                }
                if(prev == '(' && curr != ')') return false;
                if(prev == '{' && curr != '}') return false;
                if(prev == '[' && curr != ']') return false;
            }
        }

        if(!track.empty()) return false;

        return true;
    }
}