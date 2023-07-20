import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0; i < asteroids.length; i++){
            int curr = asteroids[i];
            if(curr < 0) {
                while(curr < 0 && !stack.empty() && stack.peek() > 0){
                    int last = stack.pop();
                    if(last == -curr) {
                        curr = 0;
                        break;
                    }
                    curr = last + curr > 0 ? last : curr;
                }
            }

            if(curr != 0) stack.push(curr);
        }

        int[] arr = new int[stack.size()];

        for(int i = arr.length - 1; i >=0; i--){
            arr[i] = stack.pop();
        }

        return arr;
    }
}