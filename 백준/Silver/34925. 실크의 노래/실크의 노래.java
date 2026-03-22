import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long H = Long.parseLong(st.nextToken());
        long S = Long.parseLong(st.nextToken());
        long G;
        if (H <= 2)
            G=0;
        else if (H<=4)
            G=2;
        else 
            G=3;

        long totalHP = H+G*S;
        long answer = (totalHP+1)/2;
        System.out.println(answer);
    }
}