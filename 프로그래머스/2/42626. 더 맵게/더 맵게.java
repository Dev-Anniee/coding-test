import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int p : scoville)
            pq.offer(p);
 
        int count = 0;
        while(pq.peek()<K){
            if(pq.size() < 2)
                return -1;
            int s = pq.poll() + (2 * pq.poll());
            pq.offer(s);
            count ++;
        }
        
        return count;
    }
}