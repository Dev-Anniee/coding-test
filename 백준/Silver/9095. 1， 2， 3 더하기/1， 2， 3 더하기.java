import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
                
        int[] dp = new int[12];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        
        for(int i =0; i<num; i++){
            arr[i] = sc.nextInt();
            for(int j=4; j<=arr[i]; j++){
                dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
            }
            System.out.println(dp[arr[i]]);
        }
    }
}