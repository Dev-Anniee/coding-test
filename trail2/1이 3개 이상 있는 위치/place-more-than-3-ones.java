import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine());
       int[][] grid = new int[N][N];

       for(int i=0; i<N; i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int j=0; j<N; j++){
            grid[i][j] = Integer.parseInt(st.nextToken());
        }
       }

       int[] dx = {-1,1,0,0};
       int[] dy = {0,0,-1,1};

       int answer=0;
       for(int x=0; x<N; x++){
        for(int y=0; y<N; y++){
           int count =0;
           for(int i=0; i<4; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];

            if(nx>=0&&nx<N&&ny>=0&&ny<N){
                if(grid[nx][ny]==1)
                    count++;
            }
           }
            if(count>=3)
                answer++;
        }
       }
       System.out.println(answer);
    }
}