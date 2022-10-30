class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        
        int[] rows = new int[m];
        for(int i = 0; i < m; i++){
            rows[i] = 0;
        }
        int[] cols = new int[n];
        for(int i = 0; i < n; i++){
            cols[i] = 0;
        }

        for(int[] index : indices){
            rows[index[0]]++;
            cols[index[1]]++;
        }

        int ans = 0;

        for(int r = 0; r < m; r++){
            for(int c = 0; c < n; c++){
                if((rows[r] + cols[c]) %  2 == 1) ans++;
            }
        }

        return ans;       
    }
}