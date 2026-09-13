import java.util.*;
class Solution {
    public int solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();

        int[] start = new int[2];
        int[] lever = new int[2];
        int[] exit = new int[2];

        // 1. S, L, E 위치 찾기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char c = maps[i].charAt(j);
                if (c == 'S') {
                    start[0] = i; start[1] = j;
                } else if (c == 'L') {
                    lever[0] = i; lever[1] = j;
                } else if (c == 'E') {
                    exit[0] = i; exit[1] = j;
                }
            }
        }
            int toLever = bfs(maps, start, lever, n, m);
            if (toLever == -1) return -1;
    
            // 3. Lever -> Exit
            int toExit = bfs(maps, lever, exit, n, m);
            if (toExit == -1) return -1;
    
            return toLever + toExit;
        }


        private int bfs(String[] maps, int[] start, int[] target, int n, int m){
                //오,아,왼,위
                int dx[] = {0,1,0,-1};
                int dy[] = {1,0,-1,0};

                boolean[][] visited = new boolean[n][m];
            
                Queue<int[]> q = new LinkedList<>();
                q.offer(new int[]{start[0],start[1],0});
                visited[start[0]][start[1]] = true;

            while(!q.isEmpty()){
                int[] cur = q.poll();
                int x = cur[0];
                int y = cur[1];
                int dist = cur[2];
    
                if (x == target[0] && y == target[1]) {
                    return dist;
                }
    
                for(int i=0; i<4; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
    
                if(nx<0||ny<0||nx>=n||ny>=m) continue;
    
                if (maps[nx].charAt(ny) == 'X' || visited[nx][ny]) continue;
    
                visited[nx][ny] = true;
                q.offer(new int[]{nx, ny, dist + 1});
            }
        }

        return -1;
    }
}
