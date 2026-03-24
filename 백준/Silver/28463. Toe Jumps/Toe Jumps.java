import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char dir = br.readLine().charAt(0);
        char[][] arr = new char[2][2];
        char [][] T = {{'.','O'},{'P','.'}};
        char [][] F = {{'I','.'},{'.','P'}};
        char [][] Lz = {{'O','.'},{'.','P'}};
    
        for(int i=0; i<arr.length; i++){
            String line = br.readLine();
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = line.charAt(j);
            }
        }
        
        String answer;
        int[] cnt= {0,0,0};
        
        if(dir=='S'){
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[i].length; j++){
                    if(T[i][j]==arr[i][j])
                        cnt[0]++;
                    if(F[i][j]==arr[i][j])
                        cnt[1]++;
                    if(Lz[i][j]==arr[i][j])
                        cnt[2]++;
                }
            }
            if(cnt[0]==4)
                System.out.print("T");
            else if(cnt[1]==4)
                 System.out.print("F");
            else if(cnt[2]==4)
                 System.out.print("Lz");
            else 
                System.out.print("?");
        }      
        if(dir=='N'){
            char tmp;
            tmp = arr[0][0]; arr[0][0]=arr[1][1]; arr[1][1]=tmp;
            tmp = arr[0][1]; arr[0][1]=arr[1][0]; arr[1][0]=tmp;
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[i].length; j++){
                    if(T[i][j]==arr[i][j])
                        cnt[0]++;
                    if(F[i][j]==arr[i][j])
                        cnt[1]++;
                    if(Lz[i][j]==arr[i][j])
                        cnt[2]++;
                }
            }
            if(cnt[0]==4)
                System.out.print("T");
            else if(cnt[1]==4)
                 System.out.print("F");
            else if(cnt[2]==4)
                 System.out.print("Lz");
            else 
                System.out.print("?");
        }

        if(dir=='W'){
            char tmp;
            tmp = arr[0][0]; arr[0][0] = arr[1][0]; arr[1][0] = tmp; // 상하 반전
            tmp = arr[0][1]; arr[0][1] = arr[1][1]; arr[1][1] = tmp; // 상하 반전
            tmp = arr[0][0]; arr[0][0] = arr[1][1]; arr[1][1] = tmp; // 대각선 교체
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[i].length; j++){
                    if(T[i][j]==arr[i][j])
                        cnt[0]++;
                    if(F[i][j]==arr[i][j])
                        cnt[1]++;
                    if(Lz[i][j]==arr[i][j])
                        cnt[2]++;
                }
            }
            if(cnt[0]==4)
                System.out.print("T");
            else if(cnt[1]==4)
                 System.out.print("F");
            else if(cnt[2]==4)
                 System.out.print("Lz");
            else 
                System.out.print("?");
        }
             
        if(dir=='E'){
            char tmp;
            tmp = arr[0][0]; arr[0][0] = arr[0][1]; arr[0][1] = tmp; // 좌우 반전
            tmp = arr[1][0]; arr[1][0] = arr[1][1]; arr[1][1] = tmp; // 좌우 반전
            tmp = arr[0][0]; arr[0][0] = arr[1][1]; arr[1][1] = tmp; // 대각선 교체

            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[i].length; j++){
                    if(T[i][j]==arr[i][j])
                        cnt[0]++;
                    if(F[i][j]==arr[i][j])
                        cnt[1]++;
                    if(Lz[i][j]==arr[i][j])
                        cnt[2]++;
                }
            }
            if(cnt[0]==4)
                System.out.print("T");
            else if(cnt[1]==4)
                 System.out.print("F");
            else if(cnt[2]==4)
                 System.out.print("Lz");
            else 
                System.out.print("?");
        }
    }
}