import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        // 0: N, 1: E, 2: S, 3: W 순서
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        int nx=0, ny=0;

        for(int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char dir = st.nextToken().charAt(0);
            int move = Integer.parseInt(st.nextToken());
            
            int dirNum = 0;
            if (dir == 'N') dirNum = 0;
            else if (dir == 'E') dirNum = 1;
            else if (dir == 'S') dirNum = 2;
            else if (dir == 'W') dirNum = 3;
            
            nx += dx[dirNum] * move;
            ny += dy[dirNum] * move;
        }
        
        System.out.println(nx +" "+ny);
    }
}