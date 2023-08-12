import java.util.PriorityQueue;

class Solution {
    public long pickGifts(int[] gifts, int k) {

        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        for (int gift : gifts) {
            pQueue.add(-gift);
        }

        for (int i = 0; i < k; i++) {
            pQueue.add(-(int) Math.floor(Math.sqrt(-pQueue.poll())));

        }

        long total = 0;
        while (!pQueue.isEmpty()) {
            total -= pQueue.poll();
        }

        return total;
    }
}