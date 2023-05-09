import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<Integer>();

        int m = matrix.length;
        int n = matrix[0].length;
        int iStart = 0, jStart = 0;
        int i = 0, j = 0;
        int iChange = 0, jChange = 1;

        while(iStart < (m+1)/2 && jStart < (n+1)/2){

            if(iChange == 0 && jChange == 1) {
                ans.add(matrix[iStart][jStart]);
                i = iStart;
                j = jStart;
            }

            while(true){

                i += iChange;
                j += jChange;
                
                if(i == m - iStart || j == n - jStart || i < iStart || j < jStart || (i == iStart && j == jStart)) break;
                
                ans.add(matrix[i][j]);
            }

            i -= iChange;
            j -= jChange;

            if(iChange == 0 && jChange == 1){
                iChange = 1;
                jChange = 0;
            }
            else if(iChange == 1 && jChange == 0){
                iChange = 0;
                jChange = -1;
                
                if(i == iStart && j == n - jStart - 1) break;
            }
            else if(iChange == 0 && jChange == -1){
                iChange = -1;
                jChange = 0;
                
                if(i == m - iStart -1 && j == n - jStart - 1) break;
            }
            else{
                iChange = 0;
                jChange = 1;
                iStart++;
                jStart++;
            }
        }

        System.gc();

        return ans;
    }
}