import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        PriorityQueue<Pair> queue = new PriorityQueue<Pair>();

        int limit1 = Math.min(nums1.length, k), limit2 = Math.min(nums2.length, k);

        for (int i = 0; i < limit1; i++) {
            for (int j = 0; j < limit2; j++) {

                queue.offer(new Pair(nums1[i], nums2[j]));
            }
        }

        List<List<Integer>> answer = new ArrayList<List<Integer>>();

        for (int i = 0; i < k; i++) {

            List<Integer> list = new ArrayList<>();

            Pair pair = queue.poll();
            if (pair == null)
                return answer;

            list.add(pair.i1);
            list.add(pair.i2);

            answer.add(list);

        }

        return answer;
    }
}

class Pair implements Comparable<Pair> {
    int i1;
    int i2;

    Integer sum;

    public Pair(int i1, int i2) {
        this.i1 = i1;
        this.i2 = i2;
        sum = i1 + i2;
    }

    @Override
    public int compareTo(Pair o) {

        return this.sum.compareTo(o.sum);

    }

}