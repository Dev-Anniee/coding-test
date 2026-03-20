import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr= new int[50][4];
        int arr_cnt=0;
        int score = 0;
        int finish = 21;
        boolean five=false;     
        boolean eight=false;     
        for (int j = 0; j < 10; j++){
            int cnt_zero =0;
            String input = br.readLine();
            if (input == null)
                break;
            for(int i=0; i<4; i++){
                int piece = input.charAt(i)-'0';
                arr[arr_cnt][i] = piece;
                if(piece==0)
                    cnt_zero++;
            }
            // 윷놀이 점수 계산
            if(cnt_zero==1)
              score +=1;
            else if(cnt_zero==2)
                score +=2;
            else if(cnt_zero==3)
                score +=3;
            else if(cnt_zero==4){
                score +=4;
                j--;
            }
            else if(cnt_zero==0){
                score +=5;
                j--;
            }
            

            // 윷놀이 판 계산
            if(score==5)
                five=true;
            else if(five==true&&score==8)
                finish-=8;
            else if(five==true&&eight!=false){
                finish-=4;
                eight =true;
            }
            else if(five==false&&score==10)
                finish-=4;
            arr_cnt++;
        }    

        if(score>=finish)
           System.out.println("WIN");
        else
            System.out.println("LOSE");
            
    }
}