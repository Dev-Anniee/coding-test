import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence ="";
        Stack<Character> st = new Stack<>();
        
        while (true){
            sentence = br.readLine();
            if(".".equals(sentence)) break;
            
            st.clear();
            for(int i=0; i<sentence.length(); i++){
                if(sentence.charAt(i)=='(') {st.push('(');}
                else if(sentence.charAt(i)==')') {
                    if(!st.isEmpty()&&st.peek()=='(')
                       st.pop(); 
                    else {st.push(')');break;}
                }
                
                else if(sentence.charAt(i)=='[') {st.push('[');}
                else if(sentence.charAt(i)==']') {
                    if(!st.isEmpty()&&st.peek()=='[')
                       st.pop();
                    else { st.push(']');break;}
                }
            }
            if(st.isEmpty()) 
                System.out.println("yes");
            else 
                System.out.println("no");
        }
            
    }
}
