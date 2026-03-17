import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); 

        while (true) {
            String sentence = br.readLine();
            if (".".equals(sentence)) break;

            sb.append(solve(sentence)).append("\n"); 
        }
        System.out.print(sb); 
    }

    public static String solve(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[') {
                st.push(c);
            } 

            else if (c == ')') {
                if (st.isEmpty() || st.peek() != '(') return "no";
                st.pop();
            } 

            else if (c == ']') {
                if (st.isEmpty() || st.peek() != '[') return "no";
                st.pop();
            }
        }

        return st.isEmpty() ? "yes" : "no";
    }
}