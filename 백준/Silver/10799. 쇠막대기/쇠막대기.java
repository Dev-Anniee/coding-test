import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.next();
        int n = p.length();

        Stack<Character> st = new Stack<>();
        st.push(p.charAt(0)); // String p의 첫 번째 요소 넣고 시작

        int answer = 0;
        for(int i=1; i<n; i++){
            char c = p.charAt(i);
            char pre = p.charAt(i-1);

            if(c == '('){
               st.push(c); 
            }

            // 경우의 수 : 앞의 문자가 '('인지 ')'인지   
            else{ // c == ')'일때
                st.pop();
                if(pre == '('){
                    answer += st.size();
                }
                
                else{ //pre == ')'
                     answer++;                    
                }
            }
        }
        System.out.println(answer);
    }
}