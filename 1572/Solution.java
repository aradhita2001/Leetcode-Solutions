class Solution {
    public int diagonalSum(int[][] mat) {
        
        int sum = 0;
        int len = mat.length;

        for(int i = 0; i < len; i++){
            sum += mat[i][i];
            if(i != len - 1 - i) sum += mat[i][len-1-i];
        }
        
        System.gc();

        return sum;
    }
}