import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();
        
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};

        int x =0, y=0;
        int dir=0;
        int answer =0;

        for(char command : commands.toCharArray()){
            answer++;
            if(command=='F'){
                x+=dx[dir];
                y+=dy[dir];
            }    

            else if(command=='R')
                dir = (dir+1)%4;
                

            else if(command=='L')
                dir = (dir+3)%4;
            

            if(x==0&&y==0){
                System.out.print(answer);
                return;
            }
        }
        System.out.print(-1);
    }
}