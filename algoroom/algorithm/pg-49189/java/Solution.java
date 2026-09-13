import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        // 1. 그래프에 양옆에 넣어준다 
        // 2. 큐에 넣어서 탐색한다 
        // 3. 가장 먼 길이에 있는 숫자를 구해본다

        List<List<Integer>> graph = new LinkedList<>();
        
        for(int i=0; i<n+1; i++){
            graph.add(new ArrayList<>());
        }
        
        for(int[] e : edge){ //양방향 연결
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        int[] dist = new int[n+1];
        Arrays.fill(dist,-1);
        Queue<Integer> q = new LinkedList<>();
        
        q.add(1);
        dist[1]=0;
        int max = 0;
        
        while(!q.isEmpty()){
            int cur = q.poll();

            for(int next : graph.get(cur)){
                if(dist[next]==-1){
                    dist[next] = dist[cur]+1;
                    q.add(next);
                    max = Math.max(max, dist[next]);
                }
            }
        }
        int answer =0;
        for(int d : dist){
            if(d==max)
                answer++;
        }
        return answer ;  
    }
}
