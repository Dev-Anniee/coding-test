import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int s : scoville)
            pq.offer(s);
        
        while(pq.peek()<K){
            if(pq.size()<2)
                break;
            int sauce = pq.poll() + (2*pq.poll());
            pq.offer(sauce);
            answer++;
        }
        if(pq.peek()<K)
            return -1;
        return answer;
    }
}