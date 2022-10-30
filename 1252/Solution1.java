import java.util.HashMap;

class Solution1 {
    public int oddCells(int m, int n, int[][] indices) {
        
        HashMap<Integer, Integer> rows = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> cols = new HashMap<Integer, Integer>();

        for(int[] index : indices){
            rows.put(index[0], rows.getOrDefault(index[0], 0) + 1);
            cols.put(index[1], cols.getOrDefault(index[1], 0) + 1);
        }

        int ans = 0;

        for(int r = 0; r < m; r++){
            for(int c = 0; c < n; c++){
                if((rows.getOrDefault(r, 0) + cols.getOrDefault(c, 0)) %  2 == 1) ans++;
            }
        }

        return ans;       
    }
}