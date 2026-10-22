import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        boolean answer = true;
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c =='(')
                st.push(c);
            else if(c ==')'){
                if(st.isEmpty())
                    return false;
                else {
                    st.pop();
            }}
        }
        
        if(!st.isEmpty())
            answer = false;

        return answer;
    }
}