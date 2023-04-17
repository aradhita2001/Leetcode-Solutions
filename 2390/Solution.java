import java.util.Stack;

class Solution {
    public String removeStars(String s) {
        
        char[] arr = s.toCharArray();

        Stack<Character> stack = new Stack<Character>();

        for(char c : arr){
            if(c != '*') stack.push(c);
            else{
                stack.pop();
            }
        }

        return stack.toString().substring(1, stack.toString().length() - 1).replaceAll("[, ]", "");
    }
}