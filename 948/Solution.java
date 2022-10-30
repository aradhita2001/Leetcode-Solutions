import java.util.Arrays;

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0, maxScore = 0;

        Arrays.sort(tokens);

        int low = 0, high = tokens.length - 1;

        while(low <= high){

            if(power >= tokens[low]) {
                power = power - tokens[low];
                low++;
                score++;
                if(score > maxScore) maxScore = score;
            }
            else if(score > 0){
                power = power + tokens[high];
                high--;
                score--;
            }
            else break;
        }

        return maxScore;
    }
}