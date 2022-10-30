class Solution {
    public int minPartitions(String n) {
        
        int max = 0;
        for(char i = '0'; i <= '9'; i++){
            if(n.indexOf(i) != -1) max = i - '0';
        }
        return max;
    }
}