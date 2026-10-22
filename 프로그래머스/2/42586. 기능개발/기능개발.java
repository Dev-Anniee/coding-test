import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        int[] spend = new int[n];
        
        for(int i=0; i<n; i++){
            spend[i] = (99-progresses[i]+speeds[i])/speeds[i];
        }
        
        int s = spend[0];
        int count =1;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i<n; i++){
            if(s>=spend[i])
                count++;
            else{
                arr.add(count);
                count=1;
                s = spend[i];  
            } 
        }    
        arr.add(count);
        int[] answer = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            answer[i] = arr.get(i);
        }
         
    return answer;
    }
}