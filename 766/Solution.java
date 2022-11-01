import java.util.HashMap;

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){

                if( map.containsKey(j - i)){
                    if(matrix[i][j] != map.get(j - i)) return false;
                }

                else{
                    map.put(j - i, matrix[i][j]);
                }
            }
        }

        return true;
    }
}
