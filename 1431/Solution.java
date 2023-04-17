import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> answer = new ArrayList<Boolean>();

        int maxCandy = 0;
        for(int candy : candies){
            if(candy > maxCandy) maxCandy = candy;
        }

        for(int candy : candies){
            if(candy + extraCandies >= maxCandy){
                answer.add(true);
            }
            else{
                answer.add(false);
            }
        }

        return answer;
    }
}