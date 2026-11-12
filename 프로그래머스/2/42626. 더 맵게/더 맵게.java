import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int s : scoville)
            pq.offer(s);
        
        
        int count =0;
        while(pq.peek()<K){
            if(pq.size()<2)
                return -1;
            
            int newScoville = pq.poll() + 2 * pq.poll();
            pq.offer(newScoville);
            count++;
            
        }
        
        return count;
    }
}