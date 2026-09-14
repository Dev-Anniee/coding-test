import java.util.*;

class Solution {
    public int[] solution(int[][] paper) {
        int n = paper.length;
        int m = paper[0].length;
        
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};

        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        
        int picCount = 0; // 1. 전체 그림의 개수
        int maxArea = 0;  // 2. 가장 큰 그림의 넓이
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(paper[i][j]==1&&!visited[i][j]){
                    picCount++;
                    int currentArea = 1; 
                    
                    q.offer(new int[]{i,j});
                    visited[i][j] = true;
                    
                    while(!q.isEmpty()){
                        int[] cur = q.poll();
                        int x = cur[0];
                        int y = cur[1];

                        for(int k=0; k<4; k++){
                            int nx = x+dx[k];
                            int ny = y+dy[k];

                            if(nx<0||ny<0||nx>=n||ny>=m)
                                continue;
                            if(paper[nx][ny]==1&&!visited[nx][ny]){
                                visited[nx][ny] = true;
                                q.offer(new int[]{nx, ny});
                                currentArea++;
                            }
                        }
                    }

                    maxArea = Math.max(maxArea, currentArea);
                }
            }
        }
        return new int[]{picCount, maxArea};
    }
}
