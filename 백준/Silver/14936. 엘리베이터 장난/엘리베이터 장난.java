import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int m = sc.nextInt();
        int result =0;
        
        int[] cost = new int[4];
        cost[0] = N; //동작1
        cost[1] = N / 2; // 동작 2
        cost[2] = (N + 1) / 2; // 동작 3
        cost[3] = (N + 2) / 3; // 동작 4
        Set<String> resultSet = new HashSet<>();
        
        for(int i=0; i<16; i++){
            int total_cost = 0;
            boolean[] used = new boolean[4];
            for(int j=0; j<4; j++){
                if((i&(1<<j))!=0){
                    total_cost += cost[j];
                    used[j]=true;
                }
            }
            
            if(total_cost<=m){
                String state ="";
                int limit = Math.min(N,6);
                for(int k=1; k<=limit; k++){
                    boolean isOn = false;
                    if (used[0]) isOn = !isOn;           
                    if (used[1] && k % 2 == 0) isOn = !isOn;  
                    if (used[2] && k % 2 != 0) isOn = !isOn;
                    if (used[3] && (k - 1) % 3 == 0) isOn = !isOn;
                    
                    if (isOn) {
                        state = state + "1"; 
                    } else {
                        state = state + "0";
                    }
                }
                 resultSet.add(state);
            }
        }
        System.out.println(resultSet.size());
    }
}