import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            long[] arr = new long[3];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<3; j++){
                arr[j] = Long.parseLong(st.nextToken());
            }    
            System.out.println(oblong(arr));
        }
    }
    public static String oblong(long[] arr){
        arr[1]%=2;
        if (arr[1] == 0) {
                if (arr[0] >= arr[2] && (arr[0] - arr[2]) % 2 == 0) {
                    return "Yes";
                } else {
                    return "No";
                }
            } else {
                if (arr[0] > 0 && arr[0] >= arr[2] && (arr[0] - arr[2]) % 2 == 0) {
                    return "Yes";
                } else {
                    return "No";
                }
            }
    }
}