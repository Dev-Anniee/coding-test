import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        int prev = arr[0];
        for(int i=1; i<n; i++){
            if(prev == arr[i])
                continue;
            else{
                list.add(prev);
                prev = arr[i];
            }
        }
        
        list.add(prev);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}