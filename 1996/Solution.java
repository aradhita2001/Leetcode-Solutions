class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        
        int count = 0;

        for(int i = 0; i < properties.length; i++){

            for(int j = 0; j < properties.length; j++){

                if((properties[i][0] < properties[j][0]) && (properties[i][1] < properties[j][1]))  {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}