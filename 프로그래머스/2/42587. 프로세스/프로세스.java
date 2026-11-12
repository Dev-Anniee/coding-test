import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int p : priorities)
            pq.offer(p);
        
        int count =1;
        while(!pq.isEmpty()){
            for(int i=0; i<priorities.length; i++){
                if(pq.peek() == priorities[i]){
                    if(i == location)
                        return count;
                    
                    else{
                        pq.poll();
                        count++;
                    }
                }
            }
        }
        return 0;
    }
}