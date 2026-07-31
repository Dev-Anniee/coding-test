import java.io.*;

public class Main {
    public static void printStr(int num){
        for(int i=0; i<num; i++){
            System.out.println("12345^&*()_");
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        printStr(input);
        
    }
}