import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String f = br.readLine();
        int[] arr = new int[3];

        StringTokenizer st = new StringTokenizer(f);
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int c = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int x = arr[0]-c;
        int y = arr[1];
        int z = arr[2];
        int answer = y*y-4*x*z;
        
        if(x<0)
            System.out.println(0);
        else if(x==0){
            if(arr[1]>=0 &&arr[1]*n+arr[2]>=0)
                  System.out.println(1);
            else 
                System.out.println(0);
        }
        else if(x>0){
            int fn = x * n * n + y * n + z;
            if (fn < 0) {
                System.out.println(0);
            } else {
                if(-y<=n*2*x){
                    System.out.println(1);
                }
                else{
                    if(y*y-4*x*z<=0)
                        System.out.println(1);
                    else
                        System.out.println(0);
                }
            }
        }
    }
}