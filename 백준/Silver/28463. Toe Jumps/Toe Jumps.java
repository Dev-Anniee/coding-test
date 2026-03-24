import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char dir = br.readLine().charAt(0);
        char[][] arr = new char[2][2];
    
        for(int i=0; i<arr.length; i++){
            String line = br.readLine();
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = line.charAt(j);
            }
        }
        
        char tmp;
        if(dir=='N'){
            tmp = arr[0][0]; arr[0][0]=arr[1][1]; arr[1][1]=tmp;
            tmp = arr[0][1]; arr[0][1]=arr[1][0]; arr[1][0]=tmp;
        }
        else if(dir=='W'){
            tmp = arr[0][0]; arr[0][0] = arr[1][0]; arr[1][0] = tmp; 
            tmp = arr[0][1]; arr[0][1] = arr[1][1]; arr[1][1] = tmp;
            tmp = arr[0][0]; arr[0][0] = arr[1][1]; arr[1][1] = tmp; 
        }
        else if(dir=='E'){
            tmp = arr[0][0]; arr[0][0] = arr[0][1]; arr[0][1] = tmp; 
            tmp = arr[1][0]; arr[1][0] = arr[1][1]; arr[1][1] = tmp; 
            tmp = arr[0][0]; arr[0][0] = arr[1][1]; arr[1][1] = tmp;
        }
        
        int[] cnt = new int[3];
        char[][] T = {{'.','O'},{'P','.'}}, F = {{'I','.'},{'.','P'}}, Lz = {{'O','.'},{'.','P'}};
        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                if(T[i][j] == arr[i][j]) cnt[0]++;
                if(F[i][j] == arr[i][j]) cnt[1]++;
                if(Lz[i][j] == arr[i][j]) cnt[2]++;
            }
        }

        if(cnt[0] == 4) System.out.println("T");
        else if(cnt[1] == 4) System.out.println("F");
        else if(cnt[2] == 4) System.out.println("Lz");
        else System.out.println("?");
    }
}