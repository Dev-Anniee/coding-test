import java.io.*;
public class Main {
    static void dfs(int count, int K, int N, String str){
        if(count == N) {
            System.out.println(str);
            return;
        }
        for(int i=1; i<=K; i++){
            dfs(count+1, K, N, str+i+" ");
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int K = line.charAt(0)-'0';
        int N = line.charAt(2)-'0';
        dfs(0,K, N,"");
    }
}