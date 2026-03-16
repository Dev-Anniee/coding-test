import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stk = new Stack<>();
        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++){
            int input = Integer.parseInt(br.readLine());
            if(input!=0) stk.push(input);
            else{
                if(!stk.isEmpty()) stk.pop();
            } 
        }
        int sum=0;
        for(int i=0; i<stk.size(); i++){
            sum+=stk.get(i);
        }
        System.out.println(sum);
    }
}