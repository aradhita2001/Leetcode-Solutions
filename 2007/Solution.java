import java.util.Arrays;

class Solution {
    public int[] findOriginalArray(int[] changed) {
        int orgSize = changed.length / 2;
        if(changed.length != orgSize * 2) return new int[0];


        int[] org = new int[orgSize];
        Arrays.sort(changed);
       /* System.out.println("changed array till now");
        for(int i = 0; i < changed.length; i++){
            System.out.println("  " + changed[i]);
        }*/

        int i = 0, j = 0;
        while(i < orgSize){
            int currPos = getNext(changed, j);
            if(currPos == changed.length) return new int[0];
            int curr = changed[currPos];

            boolean found = false;
            for(int k = j + 1; k < changed.length; k++){
                if(changed[k] == curr * 2){
                    org[i] = curr;
                    i++;
                    changed[k] = -1;
                    found = true;
                }

               /*  else if(changed[k] > curr * 2) {
                    System.out.println("return 3");
                    return new int[0];
                }*/
            }
            if(!found)return new int[0];
            j = currPos + 1;
        }
        return org;
    }

    public int getNext(int[] arr, int pos){
        while(pos < arr.length && arr[pos] < 0) pos++;

        return pos;
    }
}