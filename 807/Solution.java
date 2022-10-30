class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int sum = 0, len = grid.length;

        int[] rows = new int[len];
        int[] cols = new int[len];

        for(int i = 0; i < len; i++){
            int row = 0, col = 0;
            for(int j = 0; j < len; j++){
                if(grid[i][j] > row) row = grid[i][j];
                if(grid[j][i] > col) col = grid[j][i];
            }

            rows[i] = row;
            cols[i] = col;
        }

        /*for(int i = 0; i < len; i++){
            System.out.println("row" + i + " : " + rows[i]);
        }

        for(int i = 0; i < len; i++){
            System.out.println("col" + i + " : " + cols[i]);
        }*/

        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){

                int max;

                if(rows[i] > cols[j]) max = cols[j];
                else max = rows[i];
                sum = sum + max - grid[i][j];
                //System.out.print(- grid[i][j] + ((rows[i] < cols[j]) ? rows[i] : cols[i]) + "  ");
            }
           // System.out.println();
        }

        return sum;
    }
}