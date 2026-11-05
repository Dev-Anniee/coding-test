import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Stack<Integer> s = new Stack<>();
        
        for(int i=0; i<n; i++){
            while(!s.isEmpty() && prices[i] < prices[s.peek()]){
                int j = s.pop();
                answer[j] = i-j;
            }
            
            s.push(i);
        }
        
        while(!s.isEmpty()){
            int j = s.pop();
            answer[j] = n-1-j;
        }
        
        return answer;
    }
}