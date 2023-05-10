import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] generateMatrix(int n) {
        
        int curr = 1;

        int[][] matrix = new int[n][n];

        int iStart = 0, jStart = 0;
        int i = 0, j = 0;
        int iChange = 0, jChange = 1;

        while(iStart < (n+1)/2 && jStart < (n+1)/2){

            if(iChange == 0 && jChange == 1) {
               matrix[iStart][jStart] = curr++;
                i = iStart;
                j = jStart;
            }

            while(true){

                i += iChange;
                j += jChange;
                
                if(i == n - iStart || j == n - jStart || i < iStart || j < jStart || (i == iStart && j == jStart)) break;
                
                matrix[i][j] = curr++;
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
                
                if(i == n - iStart -1 && j == n - jStart - 1) break;
            }
            else{
                iChange = 0;
                jChange = 1;
                iStart++;
                jStart++;
            }
        }

        System.gc();

        return matrix;
    }
}