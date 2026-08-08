import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2;
        Set<Integer> distinctNums = new HashSet<>();
        for(int num : nums){
            distinctNums.add(num);
        }
        int distinctSize =  distinctNums.size();
        
        if(answer>distinctSize)
            answer = distinctSize;
            
        return answer;
    }
}