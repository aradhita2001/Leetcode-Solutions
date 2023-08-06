import java.util.HashSet;

class Solution {
    public int sumOfUnique(int[] nums) {

        HashSet<Integer> first = new HashSet<Integer>();
        HashSet<Integer> second = new HashSet<Integer>();

        for (int num : nums) {
            if (first.contains(num))
                second.add(num);
            else
                first.add(num);
        }

        int sum = 0;
        first.removeAll(second);
        for (int n : first) {
            sum += n;
        }

        return sum;
    }
}