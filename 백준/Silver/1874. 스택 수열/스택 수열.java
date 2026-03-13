import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stk = new Stack<>();
        StringBuilder st = new StringBuilder();
        int start =1;
        
        for(int i=0; i<n; i++){
            int target = Integer.parseInt(br.readLine());
            while(start<=target){
                stk.push(start++);
                st.append("+\n");
            } 
            if(stk.peek()==target){
                stk.pop();
                st.append("-\n");
            }
            else{
                System.out.println("NO");             
                return;   
            }
        }
        System.out.println(st.toString());
    }
}