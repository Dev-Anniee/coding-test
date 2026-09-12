import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        if(m==1 && n==1)
            return 1;
        //오아왼위
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0});

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for(int i=0; i<4; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];

                if(nx<0 || ny<0 || nx>=n || ny>=m)
                    continue;

                if(maps[nx][ny]==1){
                    maps[nx][ny] = maps[x][y]+1;
                    q.offer(new int[]{nx,ny});
                }
            }
        }
        return maps[n-1][m-1]==1?-1:maps[n-1][m-1];
    }
}
