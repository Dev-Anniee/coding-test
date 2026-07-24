import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] arr=new int[num][num];

        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};     
        int answer=0;  

        for(int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<num; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int x=0; x<num; x++){
            for(int y=0; y<num; y++){
            int count=0;
                for(int i=0; i<4; i++){
                    int nx = x+dx[i];
                    int ny = y+dy[i];

                    if(0 <=nx && nx < num && 0 <= ny && ny < num){
                        if(arr[nx][ny]==1)
                            count++;
                    }

                    if (count == 3) {
                        answer++;
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}