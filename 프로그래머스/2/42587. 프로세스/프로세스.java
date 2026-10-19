import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int p : priorities)
            pq.offer(p);
        
        int answer=0;
        while(!pq.isEmpty()){
            for(int i=0; i<priorities.length; i++){
                if(priorities[i]==pq.peek()){
                    pq.poll();
                    answer++;    
                if(location==i)
                    return answer;
                }
            }
        }
    return 0;
    }
}