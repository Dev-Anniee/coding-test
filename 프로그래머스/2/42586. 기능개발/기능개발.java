import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        int[] costs = new int[n];
        
        for(int i = 0; i < n; i++) {
            costs[i] = (100 - progresses[i] + speeds[i] - 1) / speeds[i];
        }
        
        int now = 0;
        List<Integer> arr = new ArrayList<>();
        
        while(now < n) {
            int count = 1; 
            for(int j = now + 1; j < n; j++) {
                if(costs[now] >= costs[j]) {
                    count++;
                } else {
                    break;
                }
            }
            arr.add(count);
            now += count;
        }   
    
        int[] answer = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            answer[i]= arr.get(i); 
        }
        return answer;
    }
}