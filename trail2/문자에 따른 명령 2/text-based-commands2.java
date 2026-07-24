import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int x=0, y=0;
        int dir =0; 

        for(char command : line.toCharArray()){
            switch(command){
                case 'R':
                    dir = (dir+1)%4;
                    break;
                case 'L':
                    dir = (dir+3)%4;
                    break;
                case 'F':
                    x+=dx[dir];             
                    y+=dy[dir];
                    break;
            }
        }
        System.out.println(x + " " + y );
    }
}