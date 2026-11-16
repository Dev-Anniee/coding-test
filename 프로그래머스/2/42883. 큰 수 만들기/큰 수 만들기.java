import java.util.Stack;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        
        int target = number.length() - k; 
        
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            
            while (!stack.isEmpty() && stack.peek() < c && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        
        char[] result = new char[target];
        for (int i = 0; i < target; i++) {
            result[i] = stack.get(i);
        }
        
        return new String(result);
    }
}