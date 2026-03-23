import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int reward1=0, reward2=0, reward3=0, reward4=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int time =240;
        int spend = 4;
        int total=0;
        int score = 1;
        for(int i=0; i<N; i++){
             if(time<0){
                reward(total);
                total=0;
                score = 1;
                spend = 4;
                time =240;
            }
            
            if(arr[i]==1){
                reward(total);
                total=0;
                score = 1;
                spend = 4;
                time =240;
                continue;
            }                
            else if(arr[i]==2){
                if(score>1)
                    score/=2;
                else
                    spend+=2;
            }
            else if(arr[i]==4){
                time-=56;
            }
            else if(arr[i]==5){
                if(spend>1)
                    spend-=1;
            }
            else if(arr[i]==6){
                if(score<32)
                    score*=2;
            }
            
            total +=score;
            time -= spend;
        }
        
        System.out.print(reward1+"\n");
        System.out.print(reward2+"\n");
        System.out.print(reward3+"\n");
        System.out.print(reward4);
    }
    
    public static void reward(int total){
        if(35<=total&&total<65)
            reward1++;
        else if(65<=total&&total<95)
            reward2++;
        else if(95<=total&&total<125)
            reward3++;
        else if(125<=total)
            reward4++;
    }
}