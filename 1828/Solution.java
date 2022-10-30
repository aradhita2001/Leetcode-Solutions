class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        
        int length = queries.length;
        int[] ans = new int[length];

        for(int i = 0; i < length; i++){
            
            int count = 0;
            int x = queries[i][0], y = queries[i][1];
            double r = queries[i][2];

            for(int j = 0; j < points.length; j++){

                if(distance(x, y, points[j][0], points[j][1]) <= r) count++;
            }

            ans[i] = count;
        }

        return ans;
    }

    public double distance(int x1, int y1, int x2, int y2){

        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }
}