import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> part1 = new ArrayList<Integer>();
        ArrayList<Integer> part2 = new ArrayList<Integer>();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i = 0; i < nums1.length; i++){
            set1.add(nums1[i]);
        }

        for(int i = 0; i < nums2.length; i++){
            set2.add(nums2[i]);
        }

        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        set1.removeAll(intersection);
        set2.removeAll(intersection);

        part1.addAll(set1);
        part2.addAll(set2);

        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        ans.add(0, part1);
        ans.add(1, part2);

        return ans;
    }
}