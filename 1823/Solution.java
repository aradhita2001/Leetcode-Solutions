import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int findTheWinner(int n, int k) {

        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
        }

        return queue.poll();
    }
}