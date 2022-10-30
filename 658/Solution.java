import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        ArrayList<Integer> ans = new ArrayList<Integer>();

        int low = arr.length - 1, high = arr.length;

        /*while(low < high){
            
            int mid = (low + high) / 2;

            if(arr[mid] == x) {
                low = mid;
                high = low + 1;
                break;
            }

            if(arr[mid] > x){
                high = mid - 1;
            }

            if(arr[mid] < x){
                low = mid + 1;
            }
        }

        if(low > arr.length - 1) low = arr.length - 1;
        if(high < 0) high = 0;
        */

        for(int i = 0; i < arr.length;i++){
            if(arr[i] >= x) {
                low = i - 1;
                high = i;
                break;
            }
        }
        /*
        if(arr[low] > x) {
            low--;
            high--;
        }
        */

        System.out.println(low + "  " + high);

        while(low >= 0 && high < arr.length && k > 0){

            if(x - arr[low] <= arr[high] - x) ans.add(0, arr[low--]);    
            else ans.add(arr[high++]);
            k--;
        }

        while(k > 0 && low >= 0) {
            ans.add(0, arr[low--]);
            k--;
        }
        while(k > 0 && high < arr.length) {
            ans.add(arr[high++]);
            k--;
        }

        return ans;
    }
}