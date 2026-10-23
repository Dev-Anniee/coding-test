import java.util.*;

class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        int runServers = 0; 
        
        // 장부 - 1. 끝나는 시간, 2. 끝나는 서버 개수 
        Queue<int[]> q = new LinkedList<>();
        
        for(int i =0; i<players.length; i++){
            while(!q.isEmpty() && q.peek()[0]== i){
                int[] expired = q.poll();
                runServers-=expired[1];
            }
            
            int need = players[i]/m;
            if(need>runServers){
                int addCount = need - runServers;
                q.offer(new int[]{i+k, addCount});
                runServers+=addCount;
                answer+=addCount;
            }
        }
        
        return answer;
    }
}