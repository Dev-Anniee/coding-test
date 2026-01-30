import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        
        long result =0;
        long sum =0;
        long[] count = new long[target];
        for(int i=0; i<N; i++){
            sum+=arr[i];
            int remainder = (int)(sum % target);
            if (remainder == 0) 
                result++;
            result += count[remainder];
            count[remainder]++;
        }
        System.out.println(result);
    }
}