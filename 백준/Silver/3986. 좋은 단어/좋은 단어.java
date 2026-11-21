import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        for(int i=0; i<n; i++){
            Stack<Character> st = new Stack<>();
            String alpha = sc.next();
            for(int j = 0; j<alpha.length(); j++){
                char c = alpha.charAt(j);
                if(st.isEmpty()  || st.peek() != c)
                    st.push(c);
                    
                else
                    st.pop();
            }

            if(st.isEmpty())
                count++;
        }

        System.out.println(count);
    }
}