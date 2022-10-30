class Solution {
    public int minCost(String colors, int[] neededTime) {

        int time = 0;

        if(neededTime.length == 1) return time;

        int prev = 0; 
        int next = 1;

        while(next < neededTime.length){

            
            if(colors.charAt(prev) == colors.charAt(next)){

                if(neededTime[prev] <= neededTime[next]) {
                    time = time + neededTime[prev];
                    prev = next;
                    next++;
                }
                else{
                    time = time + neededTime[next];
                    next++;
                }
            }
            else{
                prev = next;
                next++;
            }
        }

        return time;
    }
}