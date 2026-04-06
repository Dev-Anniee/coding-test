import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<T; i++){
            String s = br.readLine();
            st.clear();
            boolean isVPS = true;
            for(int j=0; j<s.length(); j++){
                char c = s.charAt(j);
                if(c=='(')
                    st.push(c);
                else if(c==')'){
                    if (!st.isEmpty()) {
                        st.pop();
                    }
                    else {
                        isVPS = false;
                    }
                }
                else 
                    st.push(c);
            }
            if(isVPS==true&&st.isEmpty())
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
    }
}