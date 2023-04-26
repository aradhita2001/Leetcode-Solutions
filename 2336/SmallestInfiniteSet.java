import java.util.Iterator;
import java.util.PriorityQueue;

class SmallestInfiniteSet {

    PriorityQueue<Integer> pq;

    public SmallestInfiniteSet() {
        pq = new PriorityQueue<Integer>();
        pq.add(1);
    }
    
    public int popSmallest() {
        int ans = pq.poll();
        if(pq.peek() == null) pq.add(ans + 1);

        return ans;
    }
    
    public void addBack(int num) {

        Iterator<Integer> itr = pq.iterator();

        while(itr.hasNext()){
            if(itr.next() > num){
                pq.add(num);
                break;
            }
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */