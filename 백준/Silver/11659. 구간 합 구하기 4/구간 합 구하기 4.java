import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int data_num = Integer.parseInt(st.nextToken());
        int sum_num = Integer.parseInt(st.nextToken());

        long [] S = new long[data_num+1];
        
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=data_num; i++)
            S[i] = S[i-1]+Integer.parseInt(st.nextToken());

        for(int q=0; q<sum_num; q++){
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int last = Integer.parseInt(st.nextToken());
            System.out.println(S[last]-S[first-1]);
        }
    }
}