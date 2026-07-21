import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        
        //북(0), 동(1), 남(2), 서(3) 
        int[] dx = new int[] {0,1,0,-1};
        int[] dy = new int[] {1,0,-1,0};

        int x=0, y=0;
        int dir =0; //초기방향 북

        for(int i =0; i<line.length(); i++){
            char ch = line.charAt(i);
            if(ch == 'R')
                dir = (dir+1)%4;
            else if (ch=='L')
                dir = (dir+3)%4;
            else if(ch=='F'){
                x+=dx[dir];
                y+=dy[dir];
            }
        }
        System.out.println(x+" "+y);
    }   
}