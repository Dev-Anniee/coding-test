import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        int[] dp = new int[input];
        dp[0] = 1; 
        if(input>1){
            dp[1] = 1; 
            for(int i=2; i<dp.length; i++)
                dp[i] =dp[i-1] +dp[i-2];
        }
        System.out.println(dp[input-1]);
    }
}