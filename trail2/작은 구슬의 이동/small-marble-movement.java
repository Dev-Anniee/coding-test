import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        char dir = st.nextToken().charAt(0);

        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        int dirNum=0;
        
        if (dir=='U') dirNum=0;
        if(dir=='D') dirNum=1;
        if (dir=='L') dirNum=2;
        if(dir=='R') dirNum=3;

        for(int i=0; i<t; i++){
            int nx=x+dx[dirNum];
            int ny=y+dy[dirNum];
            if(ny==0){
                dirNum = 3;
                continue;
            }
            if(ny==n+1){
                dirNum =2;
                continue;
            }
            if(nx==0){
                dirNum = 1;
                continue;
            }
            if(nx==n+1){
                dirNum =0;
                continue;
            }
            x=nx;
            y=ny;
        }
        System.out.println(x +" "+y);
    }
}