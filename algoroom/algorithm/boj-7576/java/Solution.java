import java.util.*;
class Solution {
    public int solution(int[][] box) {
        int n = box.length;
        int m = box[0].length;

        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};

        Queue<int[]> q = new LinkedList<>();
        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(box[i][j] == 1) {
                    q.offer(new int[]{i, j}); 
                }
            } 
        }

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for(int i=0; i<4; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
    
                if(nx<0||ny<0||nx>=n||ny>=m)
                    continue;
    
                if(box[nx][ny]==0){
                    box[nx][ny] = box[x][y] + 1;
                    q.offer(new int[]{nx, ny});
                }
            }

    }

        int max =0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(box[i][j]==0)
                    return -1;
                max = Math.max(max,box[i][j]);
            }
        }
        
        return max - 1;
    }
}
