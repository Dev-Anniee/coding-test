import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        long left = 1;
        long right = (long)Arrays.stream(times).min().getAsInt()*n;
        
        while(left<=right){
            long mid = (left+right)/2;
            long count = 0;
            for(int time : times){
                count += mid/time;
            }
            if(count>=n){
                answer = mid;
                right = mid - 1;
            }
            else 
                left = mid + 1;
        }
        return answer;
    }
}